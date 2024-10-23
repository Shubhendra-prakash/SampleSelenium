package practice.orgtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class createContactWithSupportDateTest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\sonal\\Eclipse-IDE\\SeleniumCRMGUIFramework\\src\\test\\resources\\data\\commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String BROWSER = prop.getProperty("browser"); 
		String URL = prop.getProperty("url"); 
		String USERNAME = prop.getProperty("username");
		String PASSWORD = prop.getProperty("password");
		//  Random random=new Random();
		//int randomInt = random.nextInt(500);
		//read test script data from Excel file
		FileInputStream fis1=new FileInputStream("C:\\Users\\sonal\\Eclipse-IDE\\SeleniumCRMGUIFramework\\src\\test\\resources\\data\\testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sh = wb.getSheet("org1");
		Row row = sh.getRow(4);
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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		
		Date dateObj=new Date();
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		String startDate = sim.format(dateObj);
		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 30);
		String endDate= sim.format(cal.getTime());
		
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.name("support_start_date")).clear();
		driver.findElement(By.name("support_start_date")).sendKeys(startDate);
		driver.findElement(By.name("support_end_date")).clear();
		driver.findElement(By.name("support_end_date")).sendKeys(endDate);
		driver.findElement(By.name("button")).click();

		
		//verify header orgname info expected result
		String actStartDate = driver.findElement(By.id("mouseArea_Support Start Date")).getText();
		if(actStartDate.trim().equals(startDate)) {
			System.out.println(actStartDate+" is verified==PASS===");
		}else {
			System.out.println(actStartDate+" is verified==Fail===");
		}
		String actEndDate = driver.findElement(By.id("mouseArea_Support End Date")).getText();
		if (actEndDate.trim().equals(endDate)) {
			System.out.println(actEndDate+" is verified==PASS===");
		}else {
			System.out.println(actEndDate+" is verified==FAIL===");
		}
	}
}
