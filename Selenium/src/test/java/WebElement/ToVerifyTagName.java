package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagName {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement textField = driver.findElement(By.name("q"));
	      String tagname = textField.getTagName();
	      
	      if(tagname.equals("textarea")) {
	    	  textField.sendKeys("Automation");
	    	  System.out.println("the tagname is correct");
	      }
	      else
	    	  System.out.println("the tagname is not correct");

	}

}
