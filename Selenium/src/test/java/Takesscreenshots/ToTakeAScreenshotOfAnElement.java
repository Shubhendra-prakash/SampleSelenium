package Takesscreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeAScreenshotOfAnElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		//1
		WebElement image = driver.findElement(By.xpath("//img[@alt='Google']"));
		//2
		File source = image.getScreenshotAs(OutputType.FILE);
		//3
		File target = new File("C:\\Users\\sonal\\Eclipse-IDE\\Selenium\\screenshot\\googleimg.png");
		//4
		FileHandler.copy(source, target);
	}
}
