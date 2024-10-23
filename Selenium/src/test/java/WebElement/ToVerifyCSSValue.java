package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyCSSValue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
       Thread.sleep(2000);
       
       WebElement yesButton = driver.findElement(By.id("btn"));
       //fetching the color before clicking
       String colorBeforeClicking = yesButton.getCssValue("background-color");
       System.out.println(colorBeforeClicking);
       
       yesButton.click();
       //fetching the color after clicking
       String colorAfterClicking = yesButton.getCssValue("background-color");
       System.out.println(colorAfterClicking);
       
       if(!colorBeforeClicking.equals(colorAfterClicking)) {
    	   System.out.println("Pass: the button is clicked");
       }
       else {
    	   System.out.println("Fail: the button is not clicked");
       }
       

	}

}
