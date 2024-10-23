package practiceModuleUsingMainMethod;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateOrg {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\sonal\\Eclipse-IDE\\practiceProjectComcastCRM\\src\\test\\resources\\data\\commonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String BROWSER = prop.getProperty("browser");
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("username");
		String PASSWORD = prop.getProperty("password");
		
		FileInputStream FIS=new FileInputStream("C:\\Users\\sonal\\Eclipse-IDE\\practiceProjectComcastCRM\\src\\test\\resources\\data\\ScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(FIS);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(1);
		Cell data = row.getCell(1);
		String value = data.getStringCellValue();
		
		WebDriver driver=null;
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}
		if(BROWSER.equals("edge")) {
			driver=new EdgeDriver();
		}
		else
			driver=new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys(value);
		
		

	}

}
