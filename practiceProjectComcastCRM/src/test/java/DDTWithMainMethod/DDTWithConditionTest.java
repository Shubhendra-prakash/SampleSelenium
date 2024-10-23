package DDTWithMainMethod;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDTWithConditionTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String data1 = "";
		String data2 = "";
		String data3 = "";
		String data4 = "";
		boolean flag = false;
		String expectedId="TC_09";
		
		FileInputStream fis=new FileInputStream("C:\\Users\\sonal\\Eclipse-IDE\\practiceProjectComcastCRM\\src\\test\\resources\\data\\ScriptData.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	     Sheet sh = wb.getSheet("org");
	   int rowCount = sh.getLastRowNum();
	    for(int i=1; i<=rowCount;i++) {
          	String data = sh.getRow(i).getCell(0).toString();
          	if(data.equals(expectedId)) {
          		flag=true;
	    	 data1 = wb.getSheet("org").getRow(i).getCell(1).toString();
	    	 data2 = wb.getSheet("org").getRow(i).getCell(2).toString();
	    	 data3 = wb.getSheet("org").getRow(i).getCell(3).toString();
	    	 data4 = wb.getSheet("org").getRow(i).getCell(4).toString();
          	}
	    }
	    
	    
		if(flag==true) {
	    	System.out.println(data1);
	    	System.out.println(data2);
	    	System.out.println(data3);
	    	System.out.println(data4);
	    }else {
	    	System.out.println(expectedId+" data is not available");
	    }

	}

}
