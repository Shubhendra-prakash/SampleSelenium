package webelements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomRepository.googleSearchPage;

public class StaleElementReferenceException {
 
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		
		googleSearchPage searchPage = new googleSearchPage(driver);
		searchPage.search("mirzapur");
		driver.navigate().refresh();
		searchPage.search("kalki");
	}

}
