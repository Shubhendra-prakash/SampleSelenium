package DDTWithMainMethod;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDTWithMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FileInputStream fis=new FileInputStream("C:\\Users\\sonal\\Eclipse-IDE\\practiceProjectComcastCRM\\src\\test\\resources\\data\\ScriptData.xlsx");
                    Workbook wb = WorkbookFactory.create(fis);
                    Sheet sh = wb.getSheet("sheet1");
                    int rowCount = sh.getLastRowNum();
                    for(int i=1;i<=rowCount;i++) {
                    	Row row = sh.getRow(i);
                    	String data1 = row.getCell(1).toString();
                    	String data2 = row.getCell(2).toString();
                    	System.out.println(data1+"\t"+data2);
                    	
                    }
                    
	}

}
