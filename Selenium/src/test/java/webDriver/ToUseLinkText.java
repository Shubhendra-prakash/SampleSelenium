package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseLinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
		Thread.sleep(3000);
       WebElement link = driver.findElement(By.linkText("Return Policy"));
        link.click();
       /*  String sourceCode = driver.getPageSource();
          if(sourceCode.contains("Return Policy"))
          {
        	  System.out.println("Pass: The link has been clicked");
          }
          else {
        	  System.out.println("Fail: The link has not been clicked");
          }*/
              //             OR another option
          
        String actualURL = driver.getCurrentUrl();
        if(actualURL.contains("policy")) {
        	System.out.println("Pass: The link has been clicked");
        }
        else {
      	  System.out.println("Fail: The link has not been clicked");
        }
	}

}
