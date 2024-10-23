package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllSuggestions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("virat");
		//capturing all suggestions
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//span[contains(text(), 'irat')]"));
		
		int noOfSuggestions = allSuggestions.size();
		System.out.println("the no of suggestions are :"+ noOfSuggestions);
		//printing all suggestions
		for (WebElement sug: allSuggestions) {
			System.out.println(sug.getText());
		}
	}
}
