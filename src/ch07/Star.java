package ch07;

public class Star {
	public static void main(String[] args) {
		int space = 2; // 여백
		int space2 = 2; // 오른쪽 여백
		
		for(int row = 0; row < 5; row++) {
			for(int col = 0; col < 5; col++) {
//				if(col < space | col > space2) {
				if(col == space | col == space2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			if(row < 2) {
				space--;
				space2++;
			} else {
				space++;
				space2--;
			}
			System.out.println();
		}
	}
}
