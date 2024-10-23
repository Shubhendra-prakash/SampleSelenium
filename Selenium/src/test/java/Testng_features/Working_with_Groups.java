package Testng_features;

import org.testng.annotations.Test;

public class Working_with_Groups {
	
	@Test(groups="Smoke Test")
	public void LoginTest() {
		System.out.println("executing login test");
	}
	
	@Test(groups="Smoke Test")
	public void RegisterTest() {
		System.out.println("executing register test");
	}
	@Test
	public void searchTest() {
		System.out.println("executing search test");
	}

}
