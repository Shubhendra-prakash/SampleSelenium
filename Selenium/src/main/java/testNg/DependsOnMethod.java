package testNg;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;

public class DependsOnMethod {
	
	@Test(priority=1)
	public void register() {
		System.out.println("the user has registered");
	}
   @Test(priority=2)
   public void login() {
	//   Assert
	   System.out.println("the user has logged in");
	   
   }
   
   @Test(enabled= false)
   public void addProduct() {
	   System.out.println("the product is found");
	   
   }
   
   @Test(priority=4, dependsOnMethods="addProduct")
   public void payment() {
	   System.out.println("payment is done");
	   
   }
	@Test(priority=5)
	public void logout() {
		System.out.println("the user has logged out");
	}

}
