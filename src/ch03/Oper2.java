package ch03;

public class Oper2 {
	public static void main(String[] args) {
		int num = 2324; 
		//�� �ڸ� �� 2 + 3 + 2 + 4
		
		int n1 = num % 10 ; // �� 232 ������ "4" -1���ڸ�
		System.out.println(n1);
		
		// => 232.4 (�Ҽ��� ������)
		int n2 = ( num / 10 ) % 10; //10���ڸ�
		System.out.println(n2);
		
		int n3 = ( num / 100 ) % 10; //100���ڸ�
		System.out.println(n3);
		
		int n4 = (num / 1000) % 10; //1000���ڸ�
		System.out.println(n4);
	
	}

}
