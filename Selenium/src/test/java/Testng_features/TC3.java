package Testng_features;

import org.testng.annotations.Test;

public class TC3 {
	
	@Test(dataProvider = "TestData",dataProviderClass = working_with_DataProvider.class)
	public void Tc3(String firstname, String lastname) {
		System.out.println(firstname);
		System.out.println(lastname);
	}

}
