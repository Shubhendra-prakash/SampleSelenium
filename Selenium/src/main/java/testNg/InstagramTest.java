package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InstagramTest {
	
	@Test
	public void instagramTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		
	}
	

}
