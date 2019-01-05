package array;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {

		int[] seat = new int[10];
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("----------------------------");
			System.out.print("좌석번호 | ");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println("");
			System.out.println("----------------------------");

			System.out.print("예약현황 | ");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}

			System.out.println("");
			System.out.println("----------------------------");

			System.out.println("");
			System.out.println("예매하고 싶은 좌석번호를 입력하세요.");
			System.out.println("종료는 0을 입력하세요.");
			System.out.print("좌석번호 >> ");
			int number = sc.nextInt();
			if (number == 0) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
			if (seat[number - 1] == 0) {
				System.out.println("예매 가능한 자리입니다. 예매를 진행하겠습니다.");
				seat[number - 1] = 1;
				System.out.println("예매가 완료되었습니다");
				
				
			} else {
				System.out.println("");
				System.out.println("예매 불가능한 자리입니다. 다른 좌석을 입력해주세요.");
//				System.out.println("예매하고 싶은 좌석번호를 입력하세요.");
//				System.out.print("좌석번호 >> ");
				System.out.println("");

			}

		}

	}

}
