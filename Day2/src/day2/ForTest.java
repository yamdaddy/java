package day2;

public class ForTest {

	public static void main(String[] args) {

		int sum = 0;
		// 변수값
//		1) 넣지않았을 때(쓰레기 값)
//		2) 초기값을 넣어줬을 때
//		3. 변경된 값이 들어갔을 때
		
		for (int i = 1; i <= 1000; i++) {
			sum = sum + i;
			// sum = 0
		}
		
		System.out.println("1000까지의 합은 " + sum);

		
		long mul = 1;
		for (int i = 1; i <= 20; i++) {
			mul = mul * i;
			// sum = 0
		}
		
		System.out.println("20까지의 곱은 " + mul);
		
	}

}
