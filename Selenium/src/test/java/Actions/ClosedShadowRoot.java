package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClosedShadowRoot {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[text()='Login']")).click();
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		ac.sendKeys("shubhendra").perform();
		ac.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		ac.sendKeys("prakash").perform();
		

	}

}
