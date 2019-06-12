package ch04;

public class exam04_2 {
	 public static void main(String[] args) {   
		 
		 int score = 22;
		 // 코드 작성
//		 if (_score % 2 == 0) { //2의 배수인 경우
//		 System.out.println("짝");
//	 
//		 }else if (score % 3 == 0) {//3의 배수인 경우
//			 System.out.println("쿵");	
//		 }else if (score % 2 == 0 & score % 3 == 0 ) {
//			 System.out.println("쿵짝");
//		 }
     		 if (score % 2 == 0 & score % 3 == 0) { //2의 배수인 경우
			 System.out.println("쿵짝"); 
			 }else if (score % 3 == 0) {//3의 배수인 경우
				 System.out.println("쿵");	
			 }else if (score % 2 == 0 ) {
				 System.out.println("짝");
			 }

	 }
}
