package day2;

import java.util.Scanner;

public class IfTest6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 연도: ");
		int year = sc.nextInt();
		int age = 2018 - year + 1;
		
		System.out.println(age);
		
		if (age >= 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년입니다.");
		}
		
		
	}

}
