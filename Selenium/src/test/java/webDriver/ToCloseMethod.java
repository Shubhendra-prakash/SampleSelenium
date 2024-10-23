package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseMethod {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser
				WebDriver driver= new ChromeDriver();
				// navigate the url
				driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
				Thread.sleep(2000);
				driver.findElement(By.id("browserButton2")).click();
				String parentWindow= driver.getWindowHandle();
				System.out.println("Parent window ID:"+ parentWindow);
				Set<String> allIDs=driver.getWindowHandles();
		System.out.println("======================");
		System.out.println(allIDs);
		Thread.sleep(2000);
		// close parent window
		driver.close();
		
		// close all windows
		driver.quit();
		
			}

		


	}


