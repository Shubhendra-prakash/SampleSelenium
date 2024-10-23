package practice.orgtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class createContactWithOrg {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\sonal\\Eclipse-IDE\\SeleniumCRMGUIFramework\\src\\test\\resources\\data\\commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String BROWSER = prop.getProperty("browser"); 
		String URL = prop.getProperty("url"); 
		String USERNAME = prop.getProperty("username");
		String PASSWORD = prop.getProperty("password");
		 Random random=new Random();
		int randomInt = random.nextInt(500);
		//read test script data from Excel file
		FileInputStream fis1=new FileInputStream("C:\\Users\\sonal\\Eclipse-IDE\\SeleniumCRMGUIFramework\\src\\test\\resources\\data\\testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sh = wb.getSheet("org1");
		Row row = sh.getRow(4);
		String orgName = row.getCell(2).toString()+randomInt;
		String lastName = row.getCell(4).toString() ;
		wb.close();

		WebDriver driver=null;
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}if(BROWSER.equals("edge")) {
			driver=new EdgeDriver();
		}else {
			//driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.name("button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img")).click();
		//switch to child window
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			String actUrl = driver.getCurrentUrl();
			if(actUrl.contains("Accounts&action")) {
				break;
			}
		}
		driver.findElement(By.name("search_text")).sendKeys(orgName);
		driver.findElement(By.name("search")).click();
		driver.findElement(By.xpath("//a[text()='"+orgName+ "']")).click();
		
		//switch to parent window
		Set<String> set1 = driver.getWindowHandles();
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()) {
			String windowID = it1.next();
			driver.switchTo().window(windowID);
		String actURL = driver.getCurrentUrl();
		if(actURL.contains("Contacts&action")) {
			break;
		}
		
		}
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.name("button")).click();

		//verify header orgname info expected result
		String actorgName = driver.findElement(By.id("mouseArea_Organization Name")).getText();
		if(actorgName.trim().equals(orgName)) {
			System.out.println(actorgName+" is verified==PASS===");
		}else {
			System.out.println(actorgName+" is verified==Fail===");
		}
	}
}
