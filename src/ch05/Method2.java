package ch05;

public class Method2 {
	static boolean signUp(String id, String pw) {
		// ID �ڸ��� �˻�
		if (id.length() < 4) {
			return false;
		}
		if (pw.length() < 4) {
			return false;
		}
		// pw �ڸ��� �˻�
		return true;
	}

	public static void main(String[] args) {
		boolean result = signUp("abcd", "123");
		if (result) { // if(result==true)
			System.out.println("���Լ���");
		} else {
			System.out.println("���� ����");
		}
	}
}
