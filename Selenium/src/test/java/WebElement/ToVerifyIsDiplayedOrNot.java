package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyIsDiplayedOrNot {
   public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
Thread.sleep(5000);
WebElement email = driver.findElement(By.id("email"));
email.sendKeys("shubh1@gmail.com");
Thread.sleep(2000);

WebElement error = driver.findElement(By.xpath("//p[text()='Email is invalid or already taken']"));
  boolean errorDisplay = error.isDisplayed();
   if(errorDisplay) {
	   System.out.println("Pass:the error is displayed");
   }
   else {
	   System.out.println("Fail:the error is not displayed");
   }
   }
   }
