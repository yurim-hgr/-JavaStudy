package ch11;

import java.util.Scanner;

import ch11.net.A;
import ch11.print.B;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		A a = new A();
		a.method();
		B b = new B();
		b.method();
	}
}
