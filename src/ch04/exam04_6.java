package ch04;

public class exam04_6 {
	public static void main(String[] args) {
		/*
		 * 주석(여러줄) 
		  여백4     * 
		 3       ** 
		 2      *** 
		 1     ****
		  0   *****
		 */
		int space = 4; // 여백 4

		for (int i = 1; i <= 5; i++) {//행
			for (int j = 1; j <= 5; j++) {//열
				// j의 값이 여백보다 적다면 공백, 아니면 *
				if (j <= space) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			space -= 1;// space = space -1;
			System.out.println();
		}
	}
}

