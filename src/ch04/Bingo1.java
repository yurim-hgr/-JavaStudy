package ch04;

public class Bingo1 {
	// 25까지의 빙고를 만들어보세요
	public static void main(String[] args) {
		for (int i = 1; i <= 25; i++) {
  
			if (i < 10) {
				System.out.print("0" + i + "\t");
			} else {

				System.out.print(i + "\t");
			}
			
			// 줄바꿈
			if (i % 5 == 0) {
				System.out.println();

			}
		}
	}

}