package ch04;

public class Loop2 {
	public static void main(String[] args) {
		// �ʱⰪ ; ���ǽ� ; ������ i = i + 1 , i++
		// 1�� 2�� 4��

		for (int num = 1; num <= 10; num++) {
			System.out.println("num : " + num);
			// 3��

			// 1��-2 - 3 - 4 - 2 - 3 - 4 ��
			//for (; 1 < 2;) {  ���ѹݺ�
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
		}
	}
}
