package ch04;

public class numbersum2
{
// ���ڸ��� �������� ��������
	public static void main(String[] args) {
		int num = 123456789;

		int total = 0;
		
	    for ( ; num > 0 ; num= num / 10) {
			int n = num % 10;

			total = total + n;

			num = num / 10;
		}

		System.out.println("�� �ڸ� ������ �� : " + total);
	}
}