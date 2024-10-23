package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "email")
	public WebElement emailTextField;
	
	@FindBy(id = "password")
	public WebElement passwordTextField;
	
	@FindBy(xpath = "//button[text()='Login']")
	public WebElement loginButton;
	
	
	public void LoginUser(String email, String password) {
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}

}
