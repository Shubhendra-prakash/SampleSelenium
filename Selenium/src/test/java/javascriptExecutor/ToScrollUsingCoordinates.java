package javascriptExecutor;

import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollUsingCoordinates { // |(verticle), _(horizontal)

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
	//1. Downcast the driver to Javascript Executor
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//2. Perform horizontal or vertical scrolling by using window.scrollBy(x,y) Key
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -200)");
	}
}
