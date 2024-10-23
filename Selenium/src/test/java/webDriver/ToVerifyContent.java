package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyContent {

	public static void main(String[] args) {
		// test data
		String expectedContent= "India";
		// launch the browser
		WebDriver driver= new ChromeDriver();
		// navigate to the url
		driver.get("https://www.google.com/");
		// fetching the source code
		String sourceCode=driver.getPageSource();
		//verification
		if(sourceCode.contains(expectedContent)) {
			System.out.println("pass:the content is verified");
		}
		else
			System.out.println("fail : the content is not verified");
		
	}

}
