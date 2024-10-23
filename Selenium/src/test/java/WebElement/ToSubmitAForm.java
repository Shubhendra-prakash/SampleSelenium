package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSubmitAForm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/button/buttonSubmit?sublist=3");
		Thread.sleep(2000);
		
		WebElement yesRadioButton = driver.findElement(By.id("sat1"));
		
		WebElement submitButton = driver.findElement(By.id("btn40"));
		
		yesRadioButton.click();
		submitButton.submit();
	}

}
