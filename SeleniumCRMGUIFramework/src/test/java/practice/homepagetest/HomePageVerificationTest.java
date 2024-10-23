package practice.homepagetest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageVerificationTest {
	
	@Test
	public void homePageTest() {
		String expectedPage = "Home Page";
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888/");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager");
		driver.findElement(By.id("submitButton")).click();
		
		String actTitle = driver.findElement(By.xpath("//a[@class='hdrLink']")).getText();
		
		/*
		 * if(actTitle.trim().equals(expectedPage)) {
		 * System.out.println(expectedPage+" Page is verified====PASS===="); } else
		 * System.out.println(expectedPage+" Page is not verified====FAIL====");
		 */
		//Hard Assert
		Assert.assertEquals(actTitle, expectedPage);
		driver.quit();
	}
	
	@Test
	public void verifyLogoHomePageTest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888/");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager");
		driver.findElement(By.id("submitButton")).click();
		
		boolean status = driver.findElement(By.xpath("//img[@title='vtiger-crm-logo.gif']")).isDisplayed();
		
		//Assert.assertEquals(true, status);
		Assert.assertTrue(status);
		driver.quit();
	}
	

}
