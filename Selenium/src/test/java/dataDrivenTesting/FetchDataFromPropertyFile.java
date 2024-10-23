package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//1. Converts the physical property file into Java representation
		FileInputStream fis= new FileInputStream("C:\\Users\\sonal\\Eclipse-IDE\\Selenium\\propertyData.properties");
		
		Properties prop= new Properties();
		//2. This reads the key and value pair from the property file
		prop.load(fis);
		//3. pass the key and get the value
		String url = prop.getProperty("url");
		System.out.println(url);
		
		String name = prop.getProperty("username");
		System.out.println(name);
		
		String password = prop.getProperty("password");
		System.out.println(password);
		
		

	}

}
