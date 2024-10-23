package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchUsingWebelementReference {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		
		WebElement loginFrame = driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(loginFrame);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		

	}

}
