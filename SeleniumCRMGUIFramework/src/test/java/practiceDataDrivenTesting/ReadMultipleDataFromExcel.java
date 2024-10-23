package practiceDataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws Exception, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\sonal\\Eclipse-IDE\\SeleniumCRMGUIFramework\\src\\test\\resources\\data\\testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("product");
		int rowCount = sh.getLastRowNum();
		for(int i=1;i<=rowCount;i++) {
			Row row = sh.getRow(i);
			String column1data = row.getCell(0).toString();
			String column2data = row.getCell(1).toString();
			System.out.println(column1data+"\t"+column2data);
		}
wb.close();
	}

}
