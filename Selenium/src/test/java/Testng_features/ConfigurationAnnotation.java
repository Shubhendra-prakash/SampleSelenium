package Testng_features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Executing before suite");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("Executing after suite");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("executing before test");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("executing after test");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("executing before class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("executing after class");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("executing before method");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("executing after method");
	}
	
	@Test
	public void TC1() {
		System.out.println("Executing TC1");	
	}
	@Test
	public void TC2() {
		System.out.println("Executing TC2");
	}
}
