package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toModifyDimension {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Dimension newDim=new Dimension(800, 500);
		driver.manage().window().setSize(newDim);

	}

}
