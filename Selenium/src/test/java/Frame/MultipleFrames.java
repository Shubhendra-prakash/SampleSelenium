package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		WebElement signUp = driver.findElement(By.xpath("(//iframe)[1]"));
		driver.switchTo().frame(signUp);
		driver.findElement(By.id("email")).sendKeys("shubh@gmail.com");
		driver.findElement(By.id("password")).sendKeys("shubh@10");
		driver.findElement(By.id("confirm-password")).sendKeys("shubh@10");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		WebElement signIn = driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(signIn);
		driver.findElement(By.id("username")).sendKeys("shubh");
		driver.findElement(By.id("password")).sendKeys("Shubh@10");

	}

}
