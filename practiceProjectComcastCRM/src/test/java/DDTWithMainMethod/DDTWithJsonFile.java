package DDTWithMainMethod;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DDTWithJsonFile {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser jp = new JSONParser();
		
		Object Obj = jp.parse(new FileReader("C:\\Users\\sonal\\Eclipse-IDE\\practiceProjectComcastCRM\\src\\test\\resources\\data\\data.json"));
		
		JSONObject map = (JSONObject)Obj;
		
		System.out.println(map.get("username"));
		
		
		

	}

}
