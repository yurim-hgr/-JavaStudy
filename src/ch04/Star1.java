package ch04;

public class Star1 {
	public static void main(String[] args) {
		
		/*
		 * �ּ�(������)
		 *
		 **
		 ***
		 ****
		 *****
		 */

		int count = 5;
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
}