package window2;

import java.util.Scanner;

public class MyShop2 {

	public static void main(String[] args) {

		int price = 5000;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹ��Ͻ� �ο��� �Է����ּ���.");
		System.out.print("�ֹ��ο�: ");
		int input = sc.nextInt();

		Cal2 cal2 = new Cal2();
		int sum = cal2.mul(input, price);
		if (sum >= 20000) {
			System.out.println("���� �ݾ��� " + (sum - 3000) + "��");
		} else {
			System.out.println("���� �ݾ��� " + sum + "��");
		}

	}

}
