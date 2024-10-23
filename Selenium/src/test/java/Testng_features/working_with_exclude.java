package Testng_features;

import org.testng.annotations.Test;

public class working_with_exclude {
	@Test
	public void LoginTest() {
		System.out.println("Executing login test");
	}
	@Test
	public void RegisterTest() {
		System.out.println("Executing register test");
	}
	@Test
	public void SearchTest() {
		System.out.println("Executing search test");
	}

}
