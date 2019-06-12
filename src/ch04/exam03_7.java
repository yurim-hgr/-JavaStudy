package ch04;

public class exam03_7 {

	public static void main(String[] args) {
		int num = 123456789;

		int total = 0;

		for (; num > 0; num =  num / 10) { //(초기화;조건식;증감식)
			int n = num % 10;
			System.out.println(n);
			total += n; // total = total + n;
		}
		System.out.println(total);
	}
}

