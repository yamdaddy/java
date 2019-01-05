package array;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];

		for (int n = 0; n < num.length; n++) {
			System.out.print("점수 입력 => ");
			num[n] = sc.nextInt();
		}

		for (int n : num) {
			System.out.println(n);
		}

		System.out.print("찾고 싶은 값 입력 => ");
		int find = sc.nextInt();
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] == find) {
				System.out.println("위치는 " + i);
			}
		}

		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		
		System.out.println("최소값은 " + min);
		
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		
		System.out.println("최대값은 " + max);
		
	}

}
