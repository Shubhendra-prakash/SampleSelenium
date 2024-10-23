package practiceDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class DataDrivenIntegrationWithSeleniumCodeTest {
@Test
	public void dataDrivenTest(XmlTest test) throws IOException, InterruptedException, ParseException {
		// read common data from properties file
	
		/*FileInputStream fis=new FileInputStream("C:\\Users\\sonal\\Eclipse-IDE\\SeleniumCRMGUIFramework\\src\\test\\resources\\data\\commondata.properties");
		  Properties prop=new Properties();
		  prop.load(fis);
		  String BROWSER = prop.getProperty("browser"); 
		  String URL = prop.getProperty("url"); 
		  String USERNAME = prop.getProperty("username");
		  String PASSWORD = prop.getProperty("password");*/
		                 
	                     //OR
	
		// read common data from CMD Line
		
		/*  String URL=System.getProperty("url");
		    String BROWSER=System.getProperty("browser"); 
		    String USERNAME=System.getProperty("username"); 
		    String PASSWORD=System.getProperty("password");*/
	
	                    //OR
	
	         // read Data from JSON File
	
	  /* JSONParser parser=new JSONParser();
       Object obj=parser.parse(new FileReader("C:\\Users\\sonal\\Eclipse-IDE\\SeleniumCRMGUIFramework\\src\\test\\resources\\data\\appCommonData.json"));
                JSONObject map=(JSONObject)obj;
                 String URL=map.get("url").toString();
       		    String BROWSER= map.get("browser").toString();
       		    String USERNAME=map.get("username").toString();
       		    String PASSWORD=map.get("password").toString();*/

	                           //OR
	 
	         // read Data from XML File
	
                String URL=test.getParameter("url");
       		    String BROWSER= test.getParameter("browser");
       		    String USERNAME=test.getParameter("username");
       		    String PASSWORD=test.getParameter("password");
                
		 
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
            Thread.sleep(1000);
            Actions ac=new Actions(driver);
            ac.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
            driver.findElement(By.linkText("Sign Out")).click();
            driver.quit();
	}
}
