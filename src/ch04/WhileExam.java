package ch04;

public class WhileExam {

	public static void main(String[] args) {
		int num = 12345;

		int total = 0;

		while (num > 0) {
			int n = num % 10;

			total = total + n;

			num = num / 10;
		}

		System.out.println("�� �ڸ� ������ �� : " + total);
	}
}
