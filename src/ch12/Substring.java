package ch12;

public class Substring {
	public static void main(String args[]) {
		String str = "Java ������ ";
		
		//÷���� ������ �߶󳻱�
		System.out.println(str.substring(0));
		System.out.println(str.substring(0, 8));

		String str2 = str.substring(0, 6);
		System.out.println(str2);

		String str3 = str.substring(12, 15);
		System.out.println(str3);
	}
}