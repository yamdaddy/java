package day2;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //부품을 복사해서 쓸때는 new 를 씀
		System.out.print("아이디를 입력해주세요.->"); //메시지 옆에 나타내고 싶을때는 ln 을 삭제
		int input1 = sc.nextInt();
		System.out.print("패스워드를 입력해주세요.->");
		int input2 = sc.nextInt();
		
		System.out.println("당신이 입력한 아이디는 " + input1 + ", 패스워드는 " + input2 + "입니다.");
		
		if	(input1 == 1000 && input2 == 2000) 
		{
			System.out.println("로그인 OK");
		}
		
		else 
		
		{
			System.out.println("로그인 NOT");
		}
	
		
		
		
		
	}

}
