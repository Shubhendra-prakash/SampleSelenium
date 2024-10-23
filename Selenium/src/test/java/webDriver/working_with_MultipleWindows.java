package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_MultipleWindows {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(3000);
		Set<String> childWindow = driver.getWindowHandles();
		for(String window:childWindow) {
			driver.switchTo().window(window);
			if(driver.getTitle().contains("Facebook")) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("shubh@gmail.com");
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();

	}

}
