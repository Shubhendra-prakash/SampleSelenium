package DDTWithMainMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDTWithExcelData {

	public static void main(String[] args) throws IOException  {
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\sonal\\Eclipse-IDE\\practiceProjectComcastCRM\\src\\test\\resources\\data\\ScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(1);
		Cell data = row.getCell(1);
		String value = data.getStringCellValue();
		System.out.println(value);

	}

}
