package genericUtils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	
	@BeforeSuite
	public void bs() {
		System.out.println("this is before suite");
	}
	@BeforeTest
	public void bt() {
		System.out.println("this is before test");
	}
	@BeforeClass
	public void bc() {
		System.out.println("this is before class");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("this is before method");
	}
	@AfterMethod
	public void am() {
		System.out.println("this is after method");
	}
	@AfterClass
	public void ac() {
		System.out.println("this is after class");
	}
	@AfterTest
	public void at() {
		System.out.println("this is after test");
	}
	@AfterSuite
	public void as() {
		System.out.println("this is after suite");
	}
	
	@Test
	public void test1() {
		System.out.println("this is test script 1");
	}
	@Test
	public void test2() {
		System.out.println("this is test script 2");
	}
	@Test
	public void test3() {
		System.out.println("this is test script 3");
	}

}
