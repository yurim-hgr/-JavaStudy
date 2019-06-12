package ch04;

public class exam04_4_1 {
	public static void main(String[] args) {
		//1 ~ 99 까지의 합 구하기
		
		int total = 0; // 값을 누적시키기 위한 변수
		
		for(int i =1; i <= 99; i++) {
			//7의 배수만 합 구하기
			if(i % 7 == 0) {
				
			
			total = total + i;
			}
		}
		System.out.println(total);
		
	}
}
