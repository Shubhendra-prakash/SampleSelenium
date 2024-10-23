package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkToVerifyAllignmentX {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(2000);
		
		WebElement yesButton = driver.findElement(By.id("btn"));
		WebElement noButton=driver.findElement(By.id("btn1"));
		WebElement yesButton1=driver.findElement(By.id("btn2"));
		WebElement noButton1=driver.findElement(By.id("btn3"));
		
		
		Point yesPos=yesButton.getLocation();
		Point noPos=noButton.getLocation();
		Point yesPos1=yesButton1.getLocation();
		Point noPos1 = noButton1.getLocation();
		
		int yesButtonX = yesPos.getX();
		int noButtonX=noPos.getX();
		int yesButtonX1=yesPos1.getX();
		int noButtonX1=noPos1.getX();
		
		if(yesButtonX==yesButtonX1 && noButtonX==noButtonX1) {
			System.out.println("Pass:the allignment is correct");
		}
		else {
			System.out.println("Fail:the allignment is not correct");
		}
	}

}
