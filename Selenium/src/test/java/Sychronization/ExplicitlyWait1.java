package Sychronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitlyWait1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/progress?sublist=0");
		
		WebElement start = driver.findElement(By.xpath("//button[text()='Start']"));
		WebElement reset = driver.findElement(By.xpath("//button[text()='Reset']"));
		
         start.click();
         
         WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
         wait.until(ExpectedConditions.textToBePresentInElement(start, "Start"));
         
         reset.click();
	}

}
