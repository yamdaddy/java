package day2;

import java.util.Date;
import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		
		Date date = new Date();
		int year = date.getYear()+1900;
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		int month = date.getMonth()+1; // 일단 찍어봐야 안다
		int day = date.getDay(); // 데이는 요일이다 0 - 월요일
		int day_1 = date.getDate();
		
		System.out.println(year + "년 " + month + "월 " + day_1 + "일");
		System.out.println(hour + ":" + min + ":" + sec);
	
		switch (day) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		case 7:
			System.out.println("일요일");
			break;

		default:
			break;
		}
		
		switch (month) {
		case 11: case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		case 3: case 4: case 5: case 6:
			System.out.println("봄");
			break;
		case 7: case 8:
			System.out.println("여름");
			break;

		default:
			System.out.println("가을");
			break;
		}		
		
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지");
			break;
		
		default:
			System.out.println("31일까지");
			break;
		}		
		
		
		
	}

}
