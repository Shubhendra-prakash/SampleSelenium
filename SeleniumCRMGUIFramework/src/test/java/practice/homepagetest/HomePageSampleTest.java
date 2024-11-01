package practice.homepagetest;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageSampleTest {
	
	@Test
	public void homePageTest(Method mtd) {
		Reporter.log(mtd.getName()+ " Test Start", true);
		Reporter.log(" Test Start", true);
		Reporter.log(" Step-1", true);
		
		Assert.assertEquals("Home", "Home");
		Reporter.log(" Step-2",true);
		Reporter.log(" Step-3",true);
		//as.assertAll();
		Reporter.log(mtd.getName()+" Test End",true);
		
	}
	
	@Test
	public void verifyLogoHomePageTest(Method mtd) {
		Reporter.log(mtd.getName()+ " Test Start",true);
		Reporter.log(" Test Start",true);
		SoftAssert as=new SoftAssert();
		as.assertTrue(true);
		Reporter.log(" Step-1",true);
		Reporter.log(" Step-2",true);
		Reporter.log(" Step-3",true);
		Reporter.log(mtd.getName()+" Test End",true);
		
		
		
	}
	

}
