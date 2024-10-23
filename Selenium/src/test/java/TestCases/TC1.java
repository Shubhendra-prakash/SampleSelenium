package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
	public WebDriver driver;
	
	@BeforeTest
	public void launchapplication() {
		// Launch the application
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("Execution of before test is completed");
	}
	@AfterTest
	public void closeapplication() {
		//code to close the application
		driver.close();
		System.out.println("Execution of after test is completed");
	}
	@Test
	public void seachtestcases() throws Exception {
		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println("Execution of searchtest case is completed");
	}
	@Test
	public void subscribetestcases() {
		driver.findElement(By.id("newsletter-email")).sendKeys("computers");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		System.out.println("Execution of subscribetese case is completed");
	}

}
