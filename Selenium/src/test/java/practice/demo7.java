package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String parentWindow = driver.getWindowHandle();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		driver.findElement(By.id("browserButton2")).click();
		Set<String> allIDs = driver.getWindowHandles();
		for(String id:allIDs) {
			driver.switchTo().window(id);
			String currentWindowURl = driver.getCurrentUrl();
			if(currentWindowURl.equals("https://demoapps.qspiders.com/ui/browser/Login")) {
				driver.findElement(By.id("username")).sendKeys("admin");
				driver.findElement(By.id("password")).sendKeys("password");
				driver.findElement(By.xpath("//button[text()='Login'")).click();
				break;
			}
		}
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());

	}

}
