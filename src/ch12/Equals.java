package ch12;

public class Equals {
	public static void main(String args[]) {
		String str1 = "AA";
		String str2 = "AA";
		String str3 = new String("AA");

		if (str1 == str2) {
			System.out.println("1 2 ����");
		} else {
			System.out.println("1 2 �ٸ�");
		}
		if (str1 == str3) {
			System.out.println("1 3 ����");
		} else {
			System.out.println("1 3 �ٸ�");
		}

		if (str1.equals(str3)) {//������ �츮 ���� ��� ���� 
			System.out.println("1 3 ����");
		} else {
			System.out.println("1 3 �ٸ�");
		}
	}
}