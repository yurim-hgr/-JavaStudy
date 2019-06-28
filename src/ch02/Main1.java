package ch02;

import java.util.Scanner;

public class Main1 {
	public static void main(String args[]) {
//1부터 n까지의 합
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		for (int i = 1; i <= n; i++) {
			count = count + i ;
		
		}System.out.println(count);
	}
}
