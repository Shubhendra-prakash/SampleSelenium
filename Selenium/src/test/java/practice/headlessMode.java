package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessMode {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com/");
		System.out.println("page title is:" + driver.getTitle());

	}

}
