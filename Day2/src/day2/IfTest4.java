package day2;

import java.util.Scanner;

public class IfTest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("혈액형: ");
		String bloodType = sc.next();
		System.out.print("키: ");
		int hight = sc.nextInt();
		System.out.print("몸무게: ");
		double weight = sc.nextDouble();
		
		System.out.println("===============================");
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 나이는 " + age);
		System.out.println("나의 혈액형은 " + bloodType);
		System.out.println("나의 키는 " + hight);
		System.out.println("나의 몸무게는 " + weight);
		
		
		
		
	}

}
