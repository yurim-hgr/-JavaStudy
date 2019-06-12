package ch03;

public class Oper1 {
	public static void main(String[] args) {
		System.out.println( 3 < 1 );
		System.out.println( 10 > 3 );
		
		boolean b = 3 < 1 & 10 > 3 ;
		System.out.println(b);
		
		//개발 잘 하는 법
		//1. 라이브러리 활용, 2. 조건식 잘만들기, 3. 수학
		
		//   => 조건식
		boolean b2 = 3 < 1 | 10 > 3 ;
		System.out.println(b2);
		
	}

}
