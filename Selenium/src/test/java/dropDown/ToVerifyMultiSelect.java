package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyMultiSelect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement countryDropdown = driver.findElement(By.id("select-multiple-native"));
		
	
		Select selectCountry = new Select(countryDropdown);
		boolean multiple = selectCountry.isMultiple();
		if(multiple) {
			System.out.println("thr drop down is multi select");
		}
		else
			System.out.println("thr drop down is not multi select");

	}

}
