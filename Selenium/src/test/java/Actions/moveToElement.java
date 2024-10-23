package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//Create an object of actions class
		Actions action=new Actions(driver);
		
		//move to element
		WebElement computers = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		action.moveToElement(computers).perform();
		
		WebElement desktop=driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
		action.moveToElement(desktop).perform();
		action.click().perform();
	}

}
