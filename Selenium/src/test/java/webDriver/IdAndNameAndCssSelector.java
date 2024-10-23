package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndNameAndCssSelector {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		//Identification of name, email, and password
		
		WebElement name = driver.findElement(By.id("name"));
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.id("password"));
 WebElement button = driver.findElement(By.cssSelector("button[type=\'submit\']"));
		// Performing actions
		name.sendKeys("shubh");
		email.sendKeys("shubhendraprakash@gmail.com");
		password.sendKeys("password");
		button.click();
	}

}
