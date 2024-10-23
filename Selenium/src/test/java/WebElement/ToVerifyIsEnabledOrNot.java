package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyIsEnabledOrNot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
Thread.sleep(5000);
WebElement email = driver.findElement(By.id("email"));
WebElement continueButton = driver.findElement(By.xpath("//button[@data-continue-to='password-container']"));
email.sendKeys("shubhendraprakash2@gmail.com");
Thread.sleep(2000);
boolean enabled = continueButton.isEnabled();

if(enabled) {
	System.out.println("Pass:the button is enabled");
}
else
{
	System.out.println("Fail:the button is not enabled");
}

	}

}
