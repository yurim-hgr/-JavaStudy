package ch12;

import java.util.Scanner;

public class Exam12_1_1 {

	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		System.out.print("���̵� �Է����ּ���. => ");
		Scanner s = new Scanner(System.in);
		String id = s.nextLine();

		boolean isUpper = false;
		boolean isLower = false;

		/* �ݺ����� �̿��Ͽ� ���ڿ��κ��� ���� �������� */
		/* ASCII_A �� �̸� ���ǵǾ� �ִ� �ƽ�Ű �ڵ� ����� �̿��Ͽ� */
//		/* �빮�ڿ� �ҹ��� �Է� ���� Ȯ�� */
		for (int i = 0; i < id.length(); i++) {
			char c = id.charAt(i);

			if (c >= 'A' && c <= 'Z') {
				isUpper = true;

			} else if (c >= 'a' && c <= 'z') {
				isLower = true;
			}
		}
		if (isUpper && isLower) {
			System.out.println("�Է��Ͻ� ���̵�� " + id + "�Դϴ�.");
			System.out.println("���� ���ԵǾ����ϴ�.");
		} else {
			System.out.println("���̵� Ȯ�����ּ���.");
		}
		/* �빮�ڿ� �ҹ��� �Է� ���ο� ���� ��� ��� */
	}
}