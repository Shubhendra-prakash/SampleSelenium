package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIndependentAndDependentXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("nikon camera");
		driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='D7500 20.9MP DSLR Camera with AF-S DX NIKKOR 18-140mm f/3.5-5.6G ED VR Lens, Black']/../../../..//span[text()='99,478']"));
        ele.click();
	}

}
