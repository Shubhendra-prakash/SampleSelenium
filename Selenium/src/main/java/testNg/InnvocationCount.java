package testNg;

import org.testng.annotations.Test;

public class InnvocationCount {
	
	@Test(priority=1)
	public void register() {
		System.out.println("the user has registered");
	}
   @Test(priority=2)
   public void login() {
	   System.out.println("the user has logged in");
	   
   }
   
   @Test(priority=3, invocationCount = 3)
   public void addProduct() {
	   System.out.println("the product is found");
	   
   }
   
   @Test(priority=4)
   public void payment() {
	   System.out.println("payment is done");
	   
   }
	@Test(priority=5)
	public void logout() {
		System.out.println("the user has logged out");
	}

}
