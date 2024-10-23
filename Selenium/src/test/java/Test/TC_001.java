package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_001 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
		driver.get("https://www.amazon.in/Apple-iPhone-13-128GB-Blue/dp/B09G9BL5CP/ref=sr_1_1?dib=eyJ2IjoiMSJ9.y17_HYWuTaP4tM2OKc4ALdMftlp4ZZxx_7yDLFHh1fW1Kz_zpDMcLG3SxQ3Gfrz9e-cTtQgfxWoKLc9xMBPVPI-0bbsESAylRJ2C5wSurwBCgwoUGLD-rl5b4avSZClJDhtet548NVr64b2XeELxY0vB5g13K7fmdF-gOeXogac3-NCRz0Lx_dibvo9lbyMpagEK_ETt-mHNzcO0Gmbdbe2WTMXtWxGY_sJsBfV6zJk.qI5hCjGKZosgPf_Ue6_WQZykBaSxS3i__IUP7nT7MoE&dib_tag=se&keywords=iphone&qid=1709135554&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		WebElement addToCart= driver.findElement(By.xpath("(//input[@id=\"add-to-cart-button\"])[2]"));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(addToCart));
		addToCart.click();
		WebElement ProceedToBuy= driver.findElement(By.xpath("//div[@class=\"sc-without-multicart\"]"));
        //Actions actions= new Actions(driver);   
		//actions.click(ProceedToBuy);
		JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", ProceedToBuy);
		//	WebDriverWait wait1= new WebDriverWait(driver,Duration.ofSeconds(30));
	//	wait1.until(ExpectedConditions.elementToBeClickable(proceedToBuy));
	//	proceedToBuy.click();
		
//Locate the dropdown element
WebElement dropdown = driver.findElement(By.id("myDropdown"));

//Execute JavaScript code to select an option
JavascriptExecutor j = (JavascriptExecutor) driver;
j.executeScript("arguments[0].value='Option 1';", dropdown);

	}

}
