package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToScroll {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		//driver.get("https://www.selenium.dev/");
		Actions action=new Actions(driver);
		//action.sendKeys(Keys.PAGE_DOWN).perform();
		          //OR
		//action.scrollByAmount(0, 500).perform();
		          //OR
		WebElement myaccount=driver.findElement(By.linkText("My account"));
		action.scrollToElement(myaccount).perform();
		

	}

}
