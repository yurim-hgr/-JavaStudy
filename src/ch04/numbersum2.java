package ch04;

public class numbersum2
{
// 각자리의 숫자합을 만들어보세요
	public static void main(String[] args) {
		int num = 123456789;

		int total = 0;
		
	    for ( ; num > 0 ; num= num / 10) {
			int n = num % 10;

			total = total + n;

			num = num / 10;
		}

		System.out.println("각 자리 숫자의 합 : " + total);
	}
}