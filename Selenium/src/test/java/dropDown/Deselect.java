package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement countryDropdown = driver.findElement(By.id("select-multiple-native"));
		Select selectCountry = new Select(countryDropdown);
		selectCountry.selectByVisibleText("India");
		Thread.sleep(2000);
		selectCountry.selectByVisibleText("Canada");
		Thread.sleep(2000);
		selectCountry.selectByVisibleText("Germany");
		Thread.sleep(2000);
		
		selectCountry.deselectByIndex(6);
		selectCountry.deselectByValue("Canada");
		selectCountry.deselectByVisibleText("Germany");
		
		selectCountry.selectByVisibleText("India");
		Thread.sleep(2000);
		selectCountry.selectByVisibleText("Canada");
		Thread.sleep(2000);
		selectCountry.selectByVisibleText("Germany");
		Thread.sleep(2000);
		
		selectCountry.deselectAll();
		
	}

}
