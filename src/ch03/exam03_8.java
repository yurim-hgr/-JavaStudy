package ch03;


public class exam03_8 {
	
	public static void main(String[] args) {
		 int num = -5;
		 //��� �Ǵ� ���� �ΰ��� ��츸 �Ǵ�
		 String a = (num >= 0 ) ? "���" : "����";//string ���ڿ��� ��� ����
		 
		 System.out.println( 
				(num >= 0 ) ? "���" : "����" ); // ���� ������
		 
		 //���, ����, 0 3���� ���� �Ǵ�
		 String result =
				 (num > 0) ? "��� " :
					 (num == 0) ? "0" : "����";
		 System.out.println( 
				result);
		 
		 }
}
