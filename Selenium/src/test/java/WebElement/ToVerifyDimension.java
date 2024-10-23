package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimension {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(2000);
		
WebElement yesButton = driver.findElement(By.id("btn"));
WebElement noButton = driver.findElement(By.id("btn1"));

	Dimension yesDim = yesButton.getSize();
	Dimension noDim = noButton.getSize();
	
	int yesButtonHeight = yesDim.getHeight();
	int yesButtonWidth = yesDim.getWidth();
	
	int noButtonHeight = noDim.getHeight();
	int noButtonWidth = noDim.getWidth();
	
	if(yesButtonHeight==noButtonHeight && yesButtonWidth==noButtonWidth) {
		System.out.println("Pass: the dimension is verified");
	}
	else {
		System.out.println("Fail: the dimension is not verified");
	}
	}

}
