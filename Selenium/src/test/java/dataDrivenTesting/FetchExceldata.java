package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchExceldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\sonal\\Eclipse-IDE\\Selenium\\src\\test\\resources\\demoapps.xlsx");
		Workbook workbook= WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String name = cell.getStringCellValue();
		System.out.println(name);
		
		String email = row.getCell(2).getStringCellValue();
		System.out.println(email);
		
		long phone = (long)sheet.getRow(2).getCell(3).getNumericCellValue();
		System.out.println(phone);
		
		boolean status = sheet.getRow(3).getCell(4).getBooleanCellValue();
	System.out.println(status);

	}

}
