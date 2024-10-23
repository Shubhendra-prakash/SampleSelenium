package practice.testNG;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReportTest {
	
	ExtentReports report;
	@BeforeSuite
	public void configBS() {
		// spark report config
				ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report.html");
				spark.config().setDocumentTitle("CRM Test suite results");
				spark.config().setReportName("CRM reports");
				spark.config().setTheme(Theme.DARK);
				
				// add Env information & create test
				 report=new ExtentReports();
				report.attachReporter(spark);
				report.setSystemInfo("OS", "windows-11");
				report.setSystemInfo("browser", "chrome");
	}
	
	@AfterSuite
	public void configAS() {
		report.flush();
	}
	
	@Test
	public void createContactTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		String filePath = ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentTest test = report.createTest("createContactTest");
		
		test.log(Status.INFO, "Login to app");
		test.log(Status.INFO,"navigate to contact page");
		test.log(Status.INFO,"create contact");
		if("HDFC".equals("HFDC")) {
			test.log(Status.PASS, "contact is created");
		}else {
			test.addScreenCaptureFromBase64String(filePath, "ErrorFile");
		}	
		driver.close();
	}
	
	/*
	 * @Test public void createContactWithOrg() { ExtentTest test =
	 * report.createTest("createContactWithOrg");
	 * 
	 * test.log(Status.INFO, "Login to app");
	 * test.log(Status.INFO,"navigate to contact page");
	 * test.log(Status.INFO,"create contact with Org"); if("HDFC".equals("HDFC")) {
	 * test.log(Status.PASS, "contact is created"); }else {
	 * test.log(Status.FAIL,"contact is notn created"); } }
	 * 
	 * @Test public void createContactWithPhoneNumber() { ExtentTest test =
	 * report.createTest("createContactWithPhoneNumber");
	 * 
	 * test.log(Status.INFO, "Login to app");
	 * test.log(Status.INFO,"navigate to contact page");
	 * test.log(Status.INFO,"create contact with Phone Number");
	 * if("HDFC".equals("HDFC")) { test.log(Status.PASS, "contact is created");
	 * }else { test.log(Status.FAIL,"contact is notn created"); } }
	 */

}
