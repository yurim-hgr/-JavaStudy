package ch03;

import java.util.Scanner;

public class exam03_6 {
public static void main(String[] args) {
	
	  Scanner scanner = new Scanner(System.in);        
	  System.out.print("2자리수 정수 입력(10~99)>>");         
	  
	  int n = scanner.nextInt(); //3    3 십의자리와 일의자리 띄우기
	  
      int ten; // 10의 자리 수를 저장할 변수         
      int one; // 1의 자리 수를 저장할 변수 

      boolean isMatch = false; // 두 자리 수 비교 값을 저장할 변수  - 초기화

      /* ten 변수에 10의 자리 수 대입 */        
      ten = n / 10;
      /* one 변수에 1의 자리 수 대입 */ 
      one = n % 10;
      //앞 자리수와 뒷 자리수를 분리해낼 줄 아느냐 모르느냐
      
      /* isMatch 변수에 두 개의 자리 수 비교 값 저장 */     
      isMatch = ten == one;
      System.out.println(isMatch);            
      scanner.close();   
	}
}
