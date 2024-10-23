package practiceDataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class sampleDataDrivenTesting {

	public static void main(String[] args) throws IOException {
		// Step 1 : get the java representation object of the physical file
		
		FileInputStream fis=new FileInputStream("C:\\Users\\sonal\\OneDrive\\Desktop\\commondata.properties");
		
		
		// step 2 : using properties class, load all the keys
		Properties prop=new Properties();
		prop.load(fis);
		// step 3 : get the value based on key
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
	}

}
