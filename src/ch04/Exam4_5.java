package ch04;

public class Exam4_5 {
	public static void main(String[] args) {
		// �� ���� �ֻ����� �������� ������ ���� (��1, ��2) ���·� ����ϰ�,
		// ���� ���� 10�̸� ������ �����ϴ� �ڵ� �ۼ� (Math.random() �޼ҵ�)
		boolean isContinue = true;
		int count = 0;
				

		while (isContinue) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);
			
			if ( num1 + num2 < 10){
				System.out.println( num1 + ","+ num2);
			}else {
				isContinue = false;
			} count++;
		}
		System.out.println("�ֻ����� ���� Ƚ�� : " + count);
	}
}
