package ch12;

public class CharAt2 {
	public static void main(String[] args) {
		// 012345678901234567
		String str = "Java Secure Coding";
		int len = str.length();// 18

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			// �빮���̸� + 32
			if (c >= 'A' && c <= 'Z') {// �빮��
				c = (char) (c + 32);
			}
			System.out.print(c);
		}
	}
}