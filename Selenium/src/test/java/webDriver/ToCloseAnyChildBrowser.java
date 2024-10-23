 package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAnyChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser
				WebDriver driver= new ChromeDriver();
				// navigate the url
				driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
				Thread.sleep(2000);
				driver.findElement(By.id("browserButton2")).click();
				String parentWindow= driver.getWindowHandle();
				System.out.println("Parent window ID:"+ parentWindow);
				Set<String> allIDs=driver.getWindowHandles();
	//	System.out.println("======================");
		//System.out.println(allIDs);
     for(String id:allIDs) {
    	 // switching to a window
	driver.switchTo().window(id);
	// fetch the url
	String currentURL=driver.getCurrentUrl();
	//Check the URL
	if(currentURL.equals("https://demoapps.qspiders.com/ui/browser/SignUp"));
	driver.close();
	break;
}
	}

}
