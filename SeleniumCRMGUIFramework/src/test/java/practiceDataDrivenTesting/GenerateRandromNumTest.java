package practiceDataDrivenTesting;

import java.util.Random;

public class GenerateRandromNumTest {

	public static void main(String[] args) {
		Random random=new Random();
		int rd = random.nextInt(500);
		System.out.println(rd);

	}

}
