package Testng_features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class working_with_DataProvider {
	
	//Define the data provider
	@DataProvider(name="TestData")
	public Object[][] testdata() {
		Object[][] data=new Object[3][2];
		data[0][0]="Rohit";
		data[0][1]="Sharma";
		
		data[1][0]="Virat";
		data[1][1]="Kohli";
		
		data[2][0]="Shubnam";
		data[2][1]="Gill";
		return data;
	}
	@Test(dataProvider = "TestData")
	public void TC1(String Fname, String Lname) {
		System.out.println(Fname);
		System.out.println(Lname);
	}

}
