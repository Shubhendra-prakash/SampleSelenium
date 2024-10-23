package webelements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pomRepository.LoginPage;
import pomRepository.RegisterPage;

public class ToRegisterAndLoginPage {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		RegisterPage register = new RegisterPage(driver);
		LoginPage login = new LoginPage(driver);
		
		register.registerUser("Ramlal", "ramu@gmail.com", "ram123");
		System.out.println("pass: the user has registered");
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(login.emailTextField));
		
		login.LoginUser("ramu@gmail.com", "ram123");
		
		System.out.println("pass: the user has logged in");
		
		

	}

}
