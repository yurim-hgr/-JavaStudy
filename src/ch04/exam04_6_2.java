package ch04;

public class exam04_6_2 {
	public static void main(String[] args) {
		/*
		 * 주석(여러줄) 
		 	*****
		 	 ****
		 	  ***
		 	   **
		 	    *
		 */
		int space = 0; // 여백 0

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				// j의 값이 여백보다 적다면 공백, 아니면 *
				if (j <= space) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			space += 1;// space = space +1;
			System.out.println();
		}
	}
}
