package ch07;

import java.util.Scanner;

public class Method1 {
	//전역변수, 멤버 변수 <=클래스 영역, static이 붙어있는 변수를 불러야 static에서 쓸수있다
	static int age;
	int score;
	
	static int input ( ) {
		
		Scanner s= new Scanner(System.in);
		int num = s.nextInt();
		return num;
	}

	public static void main(String[] args) {
	 System.out.println("값을 입력해주세요.");
	 //지역변수
	 int num = input();
	 if(num>5) {
	
			 
		}
	}
}

