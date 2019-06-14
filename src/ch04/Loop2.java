package ch04;

public class Loop2 {
	public static void main(String[] args) {
		// 초기값 ; 조건식 ; 증감식 i = i + 1 , i++
		// 1번 2번 4번

		for (int num = 1; num <= 10; num++) {
			System.out.println("num : " + num);
			// 3번

			// 1번-2 - 3 - 4 - 2 - 3 - 4 번
			//for (; 1 < 2;) {  무한반복
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
		}
	}
}
