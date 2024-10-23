package Sychronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ToModifyPollingPeriod {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/progress/timer?sublist=1");
		WebElement textField = driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']"));
		
		WebElement start = driver.findElement(By.xpath("//button[text()='Start']"));
		WebElement reset = driver.findElement(By.xpath("//button[text()='Reset']"));
		textField.sendKeys("2");
		start.click();
		FluentWait wait= new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(5));
		wait.until(ExpectedConditions.textToBePresentInElement(start, "Start"));
		wait.ignoring(Exception.class);
		reset.click();
		

	}

}
