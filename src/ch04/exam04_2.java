package ch04;

public class exam04_2 {
	 public static void main(String[] args) {   
		 
		 int score = 22;
		 // �ڵ� �ۼ�
//		 if (_score % 2 == 0) { //2�� ����� ���
//		 System.out.println("¦");
//	 
//		 }else if (score % 3 == 0) {//3�� ����� ���
//			 System.out.println("��");	
//		 }else if (score % 2 == 0 & score % 3 == 0 ) {
//			 System.out.println("��¦");
//		 }
     		 if (score % 2 == 0 & score % 3 == 0) { //2�� ����� ���
			 System.out.println("��¦"); 
			 }else if (score % 3 == 0) {//3�� ����� ���
				 System.out.println("��");	
			 }else if (score % 2 == 0 ) {
				 System.out.println("¦");
			 }

	 }
}
