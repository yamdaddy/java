package window2;

import java.util.Scanner;

public class myShop3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("�� ���� �Է��ϼ���.");

		System.out.print("ù��° ��: ");
		int input1 = sc.nextInt();
		System.out.print("�ι�° ��: ");
		int input2 = sc.nextInt();

		Cal2 cal = new Cal2();
		int num = cal.myCal(input1, input2);
		System.out.println("��갪�� " + (num * 100) + "�Դϴ�.");

	}

}
