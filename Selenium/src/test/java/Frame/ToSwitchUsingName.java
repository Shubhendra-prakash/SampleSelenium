package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchUsingName {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get("file:///c:Users/User/Desktop/frame.html");
		   driver.switchTo().frame("qspiders");
		   driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();

	}

}
