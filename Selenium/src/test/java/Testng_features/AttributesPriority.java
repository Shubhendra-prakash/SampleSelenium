package Testng_features;

import org.testng.annotations.Test;

public class AttributesPriority {
	
	@Test (priority = 2)
	public void LoginTest() {
		System.out.println("executing login test");
	}
	
	@Test (priority = 3)
	public void SearchTest() {
		System.out.println("executing search test");
	}
	
	@Test (priority = 1)
	public void RegisterTest() {
		System.out.println("executing register test");
	}
	
	@Test (priority = 4)
	public void SubscribeTest() {
		System.out.println("executing Subscribe Test");
	}

}
