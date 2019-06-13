package ch05;

import java.util.Scanner;

public class Method1 {
	
		static int input() {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num ;
	}
	
	public static void main(String[] args) {
		System.out.println(" 값을 입력해 주세요 . ");
		int num = input ();
		System.out.println( "입력된 값은? "+ num);
		
		
		
	}

}
