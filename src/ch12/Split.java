package ch12;

public class Split {
	public static void main(String[] args) {
		//                  ^   ^
		String str = "Java Secure Coding";//e�� �������� �����ְ� e�� ������
		String[] strs = str.split("e");
		for (String s : strs) {
			System.out.println(s);
		}
	}
}