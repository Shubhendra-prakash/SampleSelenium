package pomRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleSearchPage {

	public googleSearchPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		 
	 }
	@FindBy(name="q")
	WebElement search;
	
	public void search(String s) {
		search.clear();
		search.sendKeys(s);
		search.sendKeys(Keys.ENTER);
	}
	
	}


