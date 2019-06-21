package ch12;

public class CharAt {
	public static void main(String[] args) {
		//            012345678901234567
		String str = "Java Secure Coding";
		int len = str.length();//18
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			System.out.print(c);
		}
		System.out.println(str.charAt(12));//ÄÚµùÀÇ c
	}
}