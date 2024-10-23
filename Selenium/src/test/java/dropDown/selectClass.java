package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
	//	 WebElement sort = driver.findElement(By.id("products-orderby"));
		//Select obj1 = new Select(sort);
		/* obj1.selectByVisibleText("Price: Low to High");
		 Thread.sleep(2000);
		 
		 WebElement display=driver.findElement(By.id("products-pagesize"));
		 Select obj2=new Select(display);
		 obj2.selectByVisibleText("12");
		 Thread.sleep(2000);
		 
		 WebElement view=driver.findElement(By.id("products-viewmode"));
		 Select obj3=new Select(view);
		 obj3.selectByVisibleText("List");
		 Thread.sleep(2000);*/
		 
		 //Get Options Method
	/*	List<WebElement> sort_by = obj1.getOptions();
		for(WebElement ele:sort_by) {
			System.out.println(ele.getText());
			}
			WebElement display=driver.findElement(By.id("products-pagesize"));
			 Select obj2=new Select(display);
			 List<WebElement> dis_value = obj2.getOptions();
			 for(WebElement val:dis_value) {
				 System.out.println(val.getText());
			 }	*/
		//System.out.println(obj1.isMultiple());
			 
		}
	}


