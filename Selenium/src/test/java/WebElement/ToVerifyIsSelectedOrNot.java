package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyIsSelectedOrNot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
       Thread.sleep(2000);
       WebElement upi = driver.findElement(By.id("attended"));
       upi.click();
       boolean upiSelected = upi.isSelected();
       if(upiSelected) {
    	   System.out.println("Pass: the radio button is selected");
       }
       else {
    	   System.out.println("Fail: the radio button is not selected");
       }
	}

}
