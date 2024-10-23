package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toSetPosition {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
	Point newPos=new Point(100, 200);
	driver.manage().window().setPosition(newPos);

	}

}
