package window2;

import java.util.Scanner;

public class myShop3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("두 수를 입력하세요.");

		System.out.print("첫번째 수: ");
		int input1 = sc.nextInt();
		System.out.print("두번째 수: ");
		int input2 = sc.nextInt();

		Cal2 cal = new Cal2();
		int num = cal.myCal(input1, input2);
		System.out.println("계산값은 " + (num * 100) + "입니다.");

	}

}
