package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderDay1 {
       
	public static void main(String[] args) {
		//Test Data
		String expectedURL = "iphone";
		// launch the browser
		WebDriver driver = new ChromeDriver();
		//navigate to the URL
		driver.get("https://www.flipkart.com/search?q=iphone%2014&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		//fetch the URL on the console
		String actualURL=driver.getCurrentUrl();
		//print the URL on the console
		System.out.println("the actual URL is:" + actualURL);
		System.out.println("the expected URL is:"+ expectedURL);
		// verified
		if(actualURL.contains(expectedURL)) {
			
			System.out.println("Pass: the URL is verified");
		}
		else
			System.out.println("fail: the URL is not verified");

	}

}
