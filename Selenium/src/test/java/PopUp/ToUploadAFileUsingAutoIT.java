package PopUp;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUploadAFileUsingAutoIT {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
		
		driver.findElement(By.xpath("//div[text()='Upload File']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\sonal\\OneDrive\\Documents\\autoit\\auto12.exe");

	}

}
