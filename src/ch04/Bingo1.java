package ch04;

public class Bingo1 {
	// 25������ ���� ��������
	public static void main(String[] args) {
		for (int i = 1; i <= 25; i++) {
  
			if (i < 10) {
				System.out.print("0" + i + "\t");
			} else {

				System.out.print(i + "\t");
			}
			
			// �ٹٲ�
			if (i % 5 == 0) {
				System.out.println();

			}
		}
	}

}