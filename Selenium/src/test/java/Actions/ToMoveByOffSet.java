package Actions;

import java.time.Duration;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/* this method is used when you don't know any xpath but by using its 
        coordinates you can do actions */
public class ToMoveByOffSet {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		Actions action= new Actions(driver);
		action.moveByOffset(1310, 40).click().perform();

	}

}
