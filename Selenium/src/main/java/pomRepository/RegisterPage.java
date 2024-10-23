package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "name")
	WebElement nameTextField;
	
	@FindBy(id = "email")
	public WebElement emailTextField;
	
	@FindBy(id = "password")
	public WebElement passwordTextField;
	
	@FindBy(xpath = "//button[text()='Register']")
	public WebElement registerButton;
	
	public void registerUser(String name, String email, String password) {
		// business logic
		nameTextField.sendKeys(name);
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		registerButton.click();
	}
	
	

	
}
