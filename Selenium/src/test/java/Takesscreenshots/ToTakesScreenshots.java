package Takesscreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakesScreenshots {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		//Steps to take screenshot of webdriver(wholePage)
		//1
		TakesScreenshot ts=(TakesScreenshot)driver;
		//2
		File source = ts.getScreenshotAs(OutputType.FILE);
		//3
		File target = new File("C:\\Users\\sonal\\Eclipse-IDE\\Selenium\\screenshot\\kuchbhi.png");
		//4
		FileHandler.copy(source, target);
		
		
		 

	}

}
