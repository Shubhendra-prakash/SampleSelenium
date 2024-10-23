package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardAction {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement searchTextField = driver.findElement(By.id("small-searchterms"));
		Actions ac=new Actions(driver);
		//ac.moveToElement(searchTextField).click().sendKeys("mobiles").perform();
		
		//keyUp and keyDown
		ac.moveToElement(searchTextField).click()
		.keyDown(Keys.SHIFT).sendKeys("mobiles").keyUp(Keys.SHIFT).perform();
		

	}

}
