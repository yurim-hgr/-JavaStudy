package ch12;

public class Exam12_1_2 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		String msg = "Cyqw amkc, cyqw em";
		for (int i = 0; i < msg.length(); i++) {
			char c = msg.charAt(i);

			if (c >= 'A' && c <= 'Z') {// �빮��
				c = (char) (c + 2);
				if (c >= 'Z') {// Z�����ʰ�
					c = (char) (c - 26);
				}

			} else if (c >= 'a' && c <= 'z') {// �ҹ���
				c = (char) (c + 2);
				if (c >= 'z') {// z�����ʰ�
					c = (char) (c - 26);
				}
			}
			System.out.print(c);
		}
		/* �ݺ����� �̿��Ͽ� ���ڿ��κ��� ���� �������� */

		/* A ~ Z, a ~ z ������ �����̸� �ƽ�Ű �ڵ带 2 ������Ų �� ��� */
		/* ��, Y / y / Z / z �� ��� 2 ���� �� */
		/* ���ĺ� ������ ����� �ʵ��� ó�� */
		/* A ~ Z, a ~ z ������ ���ڰ� �ƴϸ� �״�� ��� */
	}
}