package ch04;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보2 {
public static void main(String[] args) {
	//가위 0 바위 1 보 2
	
	Scanner s = new Scanner(System.in);
	System.out.println("가위 0 바위 1 보 2 를 입력해주세요.");
	
	int 나 = s.nextInt();//가위1
	
	// 0 ~ 2 사이 수를 랜덤으로 추출
	// 방법 1 Math.random() 0.0<= ran < 1.0
	double ran = Math.random() *3; //0.0 ~ 2.999
			
	// 방법 2 Random
	Random random = new Random();
	int ran2 = random.nextInt(3); // 0~2
	
	int 상대방 = 1;//바위
	
	System.out.println("상대방이 낸숫자 : " + 상대방);
	if(나 + 1 == 상대방) { //내가 짐
		System.out.println("짐");
		
	}else { 
		if(나 == 상대방) {//비김
			System.out.println("비김");
		}else {//내가 이김
			System.out.println("이김");
		}
	}
	
}
}
