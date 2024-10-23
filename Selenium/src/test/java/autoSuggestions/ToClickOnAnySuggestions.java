package autoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnAnySuggestions {

	public static void main(String[] args) {
		//String suggestionToClick = "net worth";
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		/*driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("virat");
		//capturing all suggestions
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//span[contains(text(), 'irat')]"));
        
		for(WebElement sug:allSuggestions) {
			String suggestionText = sug.getText();
			if(suggestionText.contains(suggestionToClick)) {
				sug.click();
				break;
			}
		}*/
		                         //OR
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("virat");
		driver.findElement(By.xpath("(//span[contains(text(),'virat')])[3]")).click();
	}
}
