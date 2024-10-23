package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Tc003 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tenforce.com/");
		
	
	// Task 1
		
		driver.get("https://www.tenforce.com/career/#job");
		driver.findElement(By.xpath("(//div[@class=\"label is-dimmed\"])[1]")).click();
		
		
		//Task 2
		
WebElement IncidentManagement=driver.findElement(By.xpath("//h5[contains(text(),'Incident Management')]"));
	JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(true);",IncidentManagement);
js.executeScript("arguments[0].click();", IncidentManagement);

WebElement element= driver.findElement(By.xpath("(//div[@class=\"label | is-inverted\"])[1]"));
JavascriptExecutor j=(JavascriptExecutor)driver;
j.executeScript("arguments[0].scrollIntoView(true);", element);

		
	}

}
