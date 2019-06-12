package ch04;

import java.util.Calendar;
import java.util.Scanner;

public class 달력3 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		// 1. 현재 월의 1일로 날짜 설정
		
		Scanner s = new Scanner(System.in);
		System.out.println("년 월 입력");

		int year = s.nextInt();
		int month = s.nextInt() - 1;
				
		cal.set(year, month, 1);

		int day = cal.get(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println("" + year + month + day);
		System.out.println(week);// 토요일

		int lastDay = cal.getActualMaximum(Calendar.DATE);

		// 1일의 실제 요일 위치에 맞도록 반복문 작성 가능
		
		for (int i = 1; i < week; i++) {
			System.out.print("\t");
		}
		
		for (int d = 1; d <= lastDay; d++) {
			System.out.print(d + "\t");

			if (week % 7 == 0) { // 토요일이면 줄바꿈- 7로 나눌때 나머지가 0이 된다면
				System.out.println();
			}
			week++; // 일자가 증가될때 요일의 숫자도 같이 증가
		}
	}
}