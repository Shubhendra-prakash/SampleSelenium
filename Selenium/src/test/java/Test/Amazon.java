package Test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Oneplus Nord CE 3 5G (Grey Shimmer, 8GB RAM, 128GB Storage)'])[3]")).click();
		Thread.sleep(2000);
		Set<String> allIDs = driver.getWindowHandles();
		for(String id:allIDs) {
			driver.switchTo().window(id);
			String currentWindowTitle = driver.getTitle();
			if(currentWindowTitle.equals("Oneplus Nord CE 3 5G (Grey Shimmer, 8GB RAM, 128GB Storage) : Amazon.in")) {
				WebElement addToCart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
				 addToCart.click();
				 driver.findElement(By.id("attach-sidesheet-checkout-button")).click();
				 //break;
//				 JavascriptExecutor js=(JavascriptExecutor)driver;
//				js.executeScript("arguments[0].click", addToCart);	
//				break;
		}	
		}
		
	}
}
