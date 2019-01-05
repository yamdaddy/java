package day2;

import java.util.Scanner;

public class IfTest9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("음식종류를 선택하세요.");
		System.out.print("1)짬뽕, 2)회, 3)라면 -> ");
		
		int food = sc.nextInt(); //부품으로 활용되는 String 같은 경우에는 연산자로 계산이 불가함
		
		if (food == 1) {
			System.out.println("중국집으로 가요");
		} else if (food == 2) {
			System.out.println("일식집으로 가요");
		} else if (food == 3) {
			System.out.println("분식집으로 가요");
		} else {
			System.out.println("안먹어요");
		}
		
		
		
		
		
		
	}

}
