package ch03;



public class exam03_7 {
	
	 public static void main(String[] args) {
		 int num = 12345;
		 // �ڵ� �ۼ� (% ������)
		 
		 int num1 = num % 10; //���� �ڸ� ����
		 //1234
		 int num2 = (num / 10 ) % 10 ;
		 int num3 = (num / 100 ) % 10 ;
		 int num4 = (num / 1000 ) % 10 ;
		 int num5 = (num / 10000 ) % 10 ;
		 
		 int total = num1 + num2 + num3 + num4 + num5;
		 System.out.println("�� �ڸ� ������ �� : " + total);
	}
}
