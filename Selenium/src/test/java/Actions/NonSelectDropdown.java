package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NonSelectDropdown {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/dropdown/search?sublist=2");
		
	//	WebElement countryDropdown = driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
	WebElement stateDropdown = driver.findElement(By.xpath("//div[@id='react-select-5-placeholder']"));
		Actions action=new Actions(driver);
		//action.sendKeys(countryDropdown, "China").sendKeys(Keys.ENTER).perform();
		                            //OR
		action.sendKeys(stateDropdown, "Hong Kong").click().perform();
	}	
}
