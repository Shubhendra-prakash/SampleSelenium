 package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("admin");
		
		//swtiching back to parent/outerframe
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		
		//swtiching back to parent window
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[text()='Write a script to handle frames in web page?']")).getText();
		

	}

}
