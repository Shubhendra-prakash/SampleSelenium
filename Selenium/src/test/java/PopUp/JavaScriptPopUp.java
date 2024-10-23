package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.findElement(By.id("buttonAlert2")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.linkText("Confirm")).click();
		
		driver.findElement(By.id("buttonAlert5")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.linkText("Prompt")).click();
		driver.findElement(By.id("buttonAlert1")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		String message = alert.getText();
		alert.sendKeys("yes");
		Thread.sleep(2000);
		alert.accept();
		
		System.out.println(message);
		
		
		
		

	}

}
