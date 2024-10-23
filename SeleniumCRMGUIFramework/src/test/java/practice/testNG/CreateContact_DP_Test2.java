package practice.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact_DP_Test2 {
	
	@Test(dataProvider ="getData")
	public void createContactTest(String firstName, String lastName, long phoneNumber){
		System.out.println("FirstName: "+firstName+", lastName: "+lastName +", phoneNumber: "+phoneNumber);	
	}
	
	
	@DataProvider
	public Object[][] getData(){
		Object[][] objArr=new Object[3][3];
		objArr[0][0]="deepak";
		objArr[0][1]="HR";
		objArr[0][2]=123456789;
		objArr[1][0]="Sam";
		objArr[1][1]="HD";
		objArr[1][2]=987654321;
		objArr[2][0]="Jhon";
		objArr[2][1]="Smith";
		objArr[2][2]=876593216;
		return objArr;
	}
}
