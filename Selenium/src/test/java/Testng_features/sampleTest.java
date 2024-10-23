package Testng_features;

//import org.testng.Reporter;
import org.testng.annotations.Test;

public class sampleTest {
	
	@Test
	public void Demo() {  //test cases
		System.out.println("welcome to Testng");
		//test steps
	}
	/*@Test
	public void TC1() {
		//Reporter.log("Test Cases 1");
	}*/
	@Test
	public void RegisterTest() {
		System.out.println("executing register Test Cases");
	}
	
	@Test
	public void LoginTest() {
		System.out.println("executing Login Test Cases");
	}
	
	@Test
	public void SearchTest() {
		System.out.println("executing Search Test Cases");
	}
	

}
