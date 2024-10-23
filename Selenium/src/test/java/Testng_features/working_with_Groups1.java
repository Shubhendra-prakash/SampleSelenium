package Testng_features;

import org.testng.annotations.Test;

public class working_with_Groups1 {
	@Test(groups="Smoke Test")
	public void AddToCart() {
		System.out.println("executing add to cart test");
	}
	
	@Test(groups="Smoke Test")
	public void SubscribeTest() {
		System.out.println("executing subscribe test");
	}
	@Test
	public void VoteTest() {
		System.out.println("executing vote test");
	}

}
