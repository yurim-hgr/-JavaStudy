package ch03;

public class Oper2 {
	public static void main(String[] args) {
		int num = 2324; 
		//각 자리 합 2 + 3 + 2 + 4
		
		int n1 = num % 10 ; // 몫 232 나머지 "4" -1의자리
		System.out.println(n1);
		
		// => 232.4 (소수점 없어짐)
		int n2 = ( num / 10 ) % 10; //10의자리
		System.out.println(n2);
		
		int n3 = ( num / 100 ) % 10; //100의자리
		System.out.println(n3);
		
		int n4 = (num / 1000) % 10; //1000의자리
		System.out.println(n4);
	
	}

}
