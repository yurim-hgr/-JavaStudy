package ch03;


public class exam03_8 {
	
	public static void main(String[] args) {
		 int num = -5;
		 //양수 또는 음수 두가지 경우만 판단
		 String a = (num >= 0 ) ? "양수" : "음수";//string 문자열을 담는 변수
		 
		 System.out.println( 
				(num >= 0 ) ? "양수" : "음수" ); // 삼항 연산자
		 
		 //양수, 음수, 0 3가지 경우로 판단
		 String result =
				 (num > 0) ? "양수 " :
					 (num == 0) ? "0" : "음수";
		 System.out.println( 
				result);
		 
		 }
}
