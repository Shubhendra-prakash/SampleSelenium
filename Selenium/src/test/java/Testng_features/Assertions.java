package Testng_features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	@Test
	public void DemoWebPage() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		//Assert tool class
		// Asseting for the home page
		String title = driver.getTitle();
		Assert.assertEquals(title, "Demo Web Shop");
		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Asserting for the given search condition
		String value = driver.findElement(By.xpath("//h1[text()='Search']")).getText();
		Assert.assertEquals(value, "Search", "given text in computers search page was not displayed");
	}

}
