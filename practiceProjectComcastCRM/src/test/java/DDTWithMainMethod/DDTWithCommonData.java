package DDTWithMainMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DDTWithCommonData {
	
public static void main(String[] args) throws Throwable {
	
	FileInputStream fis=new FileInputStream("C:\\Users\\sonal\\Eclipse-IDE\\practiceProjectComcastCRM\\src\\test\\resources\\data\\commonData.properties");
	
	Properties prop=new Properties();
	prop.load(fis);
	String BROWSER = prop.getProperty("browser");
	String URL = prop.getProperty("url");
	String username = prop.getProperty("username");
	String password = prop.getProperty("password");
	
	WebDriver driver=null;
	if(BROWSER.equals("chrome")) {
		driver=new ChromeDriver();
	}
	if(BROWSER.equals("edge")){
		driver=new EdgeDriver();
	}
	else {
		driver=new ChromeDriver();
	}
	
	driver.get(URL);
	driver.findElement(By.name("user_name")).sendKeys(username);
	driver.findElement(By.name("user_password")).sendKeys(password);
	driver.findElement(By.id("submitButton")).click();
}


}
