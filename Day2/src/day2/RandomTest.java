package day2;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {

		//컨트럴+시프트+o (영문)
		Random r = new Random();

		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int num = r.nextInt(3);
			System.out.println(num);
			sum = sum + num;
			
		}
		System.out.println(sum);
		
		
		
	}

}
