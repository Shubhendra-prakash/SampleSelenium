package practice.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact_DP_Test {
	
	@Test(dataProvider ="getData")
	public void createContactTest(String firstName, String lastName){
		System.out.println("FirstName: "+firstName+", lastName: "+lastName);	
	}
	
	
	@DataProvider
	public Object[][] getData(){
		Object[][] objArr=new Object[3][2];
		objArr[0][0]="deepak";
		objArr[0][1]="HR";
		objArr[1][0]="Sam";
		objArr[1][1]="HD";
		objArr[2][0]="Jhon";
		objArr[2][1]="Smith";
		return objArr;
	}
}
