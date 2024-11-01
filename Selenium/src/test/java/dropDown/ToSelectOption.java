package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectOption {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
		      //select by index
		      Select selectDay = new Select(dayDropdown);
	          selectDay.selectByIndex(7);
	          
	          // select by value
	          Select selectMonth = new Select(monthDropdown);
	          selectMonth.selectByValue("8");
	          
	          // select by visible text
	          Select selectYear = new Select(yearDropdown);
	          selectYear.selectByVisibleText("1956");

	}

}
