package testNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion {
	
	@Test
	public void demo() {
		 String a = "Qspider";
		 String b = "Jspider";
		 
		 SoftAssert sa = new SoftAssert();
		 sa.assertEquals(a, b);
		// System.out.println("PASS");
		 
		 sa.assertAll();
		 System.out.println("PASS");
	}

}
