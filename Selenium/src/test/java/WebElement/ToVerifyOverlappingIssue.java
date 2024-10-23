package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyOverlappingIssue {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("local host");
		
		
		WebElement username = driver.findElement(By.id("//(input)[1]"));
		WebElement email = driver.findElement(By.id("(input)[2]"));
		// Creating a Rectangle Ref of username & email
		 Rectangle usernameRect = username.getRect();
		 Rectangle emailRect = email.getRect();
		 //fetching the start Y of username
		 int a1 = usernameRect.getY();
		//fetching the start Y of username
		 int a2 = usernameRect.getHeight();
		//finding the end Y of username
		int a= a1+a2;
		//fetching the start Y of email
		int b = emailRect.getY();
		
		if(b>=a) {
			System.out.println("Pass: No overlapping");
		}
		else {
			System.out.println("Fail: overlapping");
		}
		

		
	}

}
