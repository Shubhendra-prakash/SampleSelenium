package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentURL {

	public static void main(String[] args) {
		//Test Data
		String expectedURL = "iphone";
		// launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//navigate to the URL
		driver.get("https://www.flipkart.com/search?q=iphone%2014&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		//fetch the URL on the console
        String actualURL = driver.getCurrentUrl();
      //print the URL on the console
        System.out.println("this is actual URL: "+ actualURL);
        System.out.println("this is expected URL: "+ expectedURL);
     // verified
        if(actualURL.contains(expectedURL))
        	System.out.println("this is verified");
        else
        	System.out.println("this is not verified");
	}
}
