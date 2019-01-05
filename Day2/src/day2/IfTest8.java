package day2;

import java.util.Scanner;

public class IfTest8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요.-> ");
		int input1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요.-> ");
		int input2 = sc.nextInt();
		
		if (input1 == input2) {
			System.out.println("두 숫자가 같습니다");
		} else if (input1 > input2) {
			System.out.println("첫번째 숫자가 더 큽니다");
		} else {
			System.out.println("두번째 숫자가 더 큽니다");
		} 		
	

		
	}

}
