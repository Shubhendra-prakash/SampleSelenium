package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	@Test
	public void demo() {
		
		int a=123;
		int b=123;
		
		Assert.assertEquals(a, b);
		System.out.println("PASS");
	}
	
	@Test
	public void test() {
		
		String actual = "Qspider";
		String expected = "Jspider";
		Assert.assertTrue(actual.contains(expected));
		System.out.println("PASS");
	}
}
