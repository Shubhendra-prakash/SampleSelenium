package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class subscribeTest {
	
	@Test
	public void subscribetest() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Reporter.log("Application launched successfully");
		driver.findElement(By.id("newsletter-email")).sendKeys("abc@test.com");
		Thread.sleep(1000);
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		Reporter.log("subscribe test cases completed");
		driver.close();
		
	}

}
