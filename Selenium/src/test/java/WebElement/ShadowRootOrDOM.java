package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRootOrDOM {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		//driver.findElement(By.xpath("[placeholder='Enter your username']")).sendKeys("abcd");
		driver.findElement(By.xpath("(//div[@class='my-3'])[1]")).getShadowRoot()
		.findElement(By.cssSelector("input[placeholder='Enter your username']")).sendKeys("Admin");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='my-3'])[2]")).getShadowRoot()
		.findElement(By.cssSelector("input[type='text']"))
		.sendKeys("password");

	}

}
