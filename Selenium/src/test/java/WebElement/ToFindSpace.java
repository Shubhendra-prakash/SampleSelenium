package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindSpace {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(2000);
		WebElement yesButton = driver.findElement(By.id("btn"));
		WebElement noButton = driver.findElement(By.id("btn1"));

		Rectangle yesButtonRect = yesButton.getRect();
		Rectangle noButtonRect = noButton.getRect();
		
		int a= yesButtonRect.getX();
		int b= noButtonRect.getWidth();
		int c= a+b;
		int d = noButtonRect.getX();
		int space = d-c;
		System.out.println(space);
	}

}
