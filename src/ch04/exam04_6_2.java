package ch04;

public class exam04_6_2 {
	public static void main(String[] args) {
		/*
		 * �ּ�(������) 
		 	*****
		 	 ****
		 	  ***
		 	   **
		 	    *
		 */
		int space = 0; // ���� 0

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				// j�� ���� ���麸�� ���ٸ� ����, �ƴϸ� *
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
