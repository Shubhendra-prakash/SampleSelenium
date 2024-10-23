package practiceDataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateOrgTest {

	public static void main(String[] args) throws IOException {
				FileInputStream fis=new FileInputStream("C:\\Users\\sonal\\Eclipse-IDE\\SeleniumCRMGUIFramework\\src\\test\\resources\\data\\commondata.properties");
			
				Properties prop=new Properties();
				prop.load(fis);
				
				String browser = prop.getProperty("browser");
		        String url = prop.getProperty("url");
				String username = prop.getProperty("username");
				String password = prop.getProperty("password");
				//System.out.println(browser);
				//System.out.println(url);
				/*Scanner s=new Scanner(System.in);
				System.out.println("enter the browser");
				String Browser = s.next();*/
				WebDriver driver=null;
				if(browser.equals("chrome")) {
					driver=new ChromeDriver();
				}if(browser.equals("edge")) {
					driver=new EdgeDriver();
				}else {
					driver=new ChromeDriver();
				}
		
     // WebDriver driver=new ChromeDriver();
      driver.get(url);
      driver.findElement(By.name("user_name")).sendKeys(username);
      driver.findElement(By.name("user_password")).sendKeys(password);
      driver.findElement(By.id("submitButton")).click();
      driver.findElement(By.linkText("Organizations")).click();
      driver.quit();

	}

}
