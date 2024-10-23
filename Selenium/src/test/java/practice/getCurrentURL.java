package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentURL {

	public static void main(String[] args) {
		String expectedURL = "watch";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=watch&crid=11TIKL3MPO6H2&sprefix=watch%2Caps%2C290&ref=nb_sb_noss_1");
		String actualURL = driver.getCurrentUrl();
		System.out.println("this is actualURL: "+ actualURL);
		System.out.println("this is expectedURL: "+ expectedURL);
		if(actualURL.contains(expectedURL))
			System.out.println("content is verified");
		else
			System.out.println("content is not verified");

	}

}
