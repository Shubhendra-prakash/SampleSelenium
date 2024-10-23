package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(2000);
		
		WebElement yesButton = driver.findElement(By.id("btn"));
		WebElement noButton = driver.findElement(By.id("btn1"));
		
				Point yesPos = yesButton.getLocation();
				Point noPos = noButton.getLocation();
				
			int yesButtonY = yesPos.getY();
				int noButtonY = noPos.getY();
				
				if(yesButtonY==noButtonY) {
					System.out.println("Pass: the allignment is verified");
			
				}
				else {
					System.out.println("Fail: the allignment is not verified");
				}
				

	}

}
