package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowIDs {

	public static void main(String[] args) throws InterruptedException {
	// launch the browser
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// navigate the url
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		Thread.sleep(2000);
		driver.findElement(By.id("browserButton3")).click();
		String parentWindow= driver.getWindowHandle();
		System.out.println("Parent window ID:"+ parentWindow);
		Set<String> allIDs=driver.getWindowHandles();
System.out.println("======================");
System.out.println(allIDs);
	}

}
