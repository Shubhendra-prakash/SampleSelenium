package practice.orgtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
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

public class createOrgNameTest {

	public static void main(String[] args) throws Throwable {
		// read common data from properties file
		
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
				Sheet sh = wb.getSheet("org");
				Row row = sh.getRow(1);
				String orgName = row.getCell(2).toString() + randomInt;
				wb.close();
				
				WebDriver driver=null;
				if(BROWSER.equals("chrome")) {
					driver=new ChromeDriver();
				}if(BROWSER.equals("edge")) {
					driver=new EdgeDriver();
				}else {
					//driver=new ChromeDriver();
				}
				//step 1: login to app
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	            driver.get(URL);
	            driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	            driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	            driver.findElement(By.id("submitButton")).click();
	            // step 2: navigate to organization module
	            driver.findElement(By.linkText("Organizations")).click();
	            //step 3: Click on "create organization" Button 
	            driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	            // step 4: enter all the details @ create new organization
	            driver.findElement(By.name("accountname")).sendKeys(orgName);
	            driver.findElement(By.name("button")).click();
	            
	            //verify the Header msg expected result 
	            String headerInfo = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	            if(headerInfo.contains(orgName)) {
	            	System.out.println(orgName+" is created==PASS===");
	            }else {
	            	System.out.println(orgName+" is not created==FAIL===");
	            }
	            //verify header orgname info expected result
	           String actOrgName = driver.findElement(By.id("mouseArea_Organization Name")).getText();
	           if(actOrgName.equals(orgName)) {
	        	   System.out.println(actOrgName+" is verified==PASS===");
	           }else {
	        	   System.out.println(actOrgName+" is verified==PASS===");
	           }
	}

}
