package ch04;

public class exam04_4_1 {
	public static void main(String[] args) {
		//1 ~ 99 ������ �� ���ϱ�
		
		int total = 0; // ���� ������Ű�� ���� ����
		
		for(int i =1; i <= 99; i++) {
			//7�� ����� �� ���ϱ�
			if(i % 7 == 0) {
				
			
			total = total + i;
			}
		}
		System.out.println(total);
		
	}
}
