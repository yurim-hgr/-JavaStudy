package ch04;

public class Gugudan2 {
// 2단대로 한 줄 3단대로 한 줄 만들기
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");// \t 일정간격 띄우기
			}

			System.out.println();// 줄바꿈!
		}
	}
}