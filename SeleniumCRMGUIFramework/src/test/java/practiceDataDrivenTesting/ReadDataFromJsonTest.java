package practiceDataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJsonTest {

	public static void main(String[] args) throws Throwable, IOException, ParseException {
		
		//step 1: parse Json physical file in to JAva Object using jSonParse class
		
		JSONParser parser=new JSONParser();
		// this will convert JSON physical file into java object
	Object obj=	parser.parse(new FileReader("C:\\Users\\sonal\\Eclipse-IDE\\SeleniumCRMGUIFramework\\src\\test\\resources\\data\\appCommonData.json"));
		// step 2 : Convert java Object in to JSonObject using down casting 
	JSONObject map=(JSONObject)obj;
	// step 3 : get the value from JSON file using key
	System.out.println(map.get("url"));
	System.out.println(map.get("browser"));
	System.out.println(map.get("username"));
	System.out.println(map.get("password"));
	System.out.println(map.get("timeOut"));

	}

}
