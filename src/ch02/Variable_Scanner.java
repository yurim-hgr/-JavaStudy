package ch02;  

import java.util.Scanner;

public class Variable_Scanner {
	public static void main(String[] args) {
		//ctrl + F11 : 클래스 실행
		//라이브러리 ,library
		Scanner s = new Scanner(System.in );
		System.out.println( "숫자를 입력해주세요.");
		
		//숫자 입력
		int n = s.nextInt(); //키보드입력 숫자 가져오기
		System.out.println("입력된 값은 " + n);
		System.out.println(  (char) n);
		
		
		//문자 입력
		String text = s.next();
		System.out.println("입력된 값은 " + text);
	}
}
	