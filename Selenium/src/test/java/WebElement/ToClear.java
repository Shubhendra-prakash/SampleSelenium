package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClear {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("local host url");
		
		WebElement username = driver.findElement(By.xpath("(//input)[1]"));
		WebElement email = driver.findElement(By.xpath("(//input)[2]"));
		WebElement password = driver.findElement(By.xpath("(//input)[3]"));
		
		username.clear();
		username.sendKeys("java");
		email.clear();
		email.sendKeys("java@gmail.com");
		password.clear();
		password.sendKeys("java123");
		

	}

}
