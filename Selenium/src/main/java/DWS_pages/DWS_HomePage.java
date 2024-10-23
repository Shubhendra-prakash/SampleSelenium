package DWS_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_HomePage {
	
	//constructor
	public DWS_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		//WebElements
		@FindBy(id="small-searchterms") 
		WebElement searchtxt;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement searchButton;
		
	

}
