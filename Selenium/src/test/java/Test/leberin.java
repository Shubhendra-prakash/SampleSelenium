package Test;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class leberin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		WebElement textField = driver.findElement(By.name("q"));
		textField.sendKeys("Liberin Technologies");
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//h3[text()='Home | Liberin Technologies | IT Services and Consultancy']")).click();
		
		
		

	}

}
