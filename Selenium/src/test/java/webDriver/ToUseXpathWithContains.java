package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathWithContains {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://demoapps.qspiders.com/ui?scenario=1");
         Thread.sleep(3000);
         
         driver.findElement(By.xpath("//a[contains(text() , 'Login Now')]")).click();

	}

}
