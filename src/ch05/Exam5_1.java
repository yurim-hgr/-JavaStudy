package ch05;

public class Exam5_1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		String sep = "";// ������

		for (int i = 0; i < arr.length; i++) {
			// �ε��� , ���� ��� �� arr[i]

			int value = arr[i];
			if (value % 2 != 0) {// Ȧ���̸�
				System.out.print(sep + value);
				sep = ",";

			}
		}
	}
}