package ch04;

public class exam04_4_2 {
	public static void main(String[] args) {
		

		//1000 이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력
		//출력된 숫자들의 합을 구하는 코드 작성
		
		int total = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 0 & i % 7 == 0 ) {
				System.out.println(i);
				total = total + i;// total += i;
				
			}
			
		}
		System.out.println("각 숫자들의 합 : " + total);
	}
		
}
