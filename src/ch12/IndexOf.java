package ch12;

public class IndexOf {
	public static void main(String args[]) {
		//            01234567890123456789
		String str = "Java ������ �缺�� ���� ����������!!";

		
		int idx = str.indexOf(" ");
		System.out.println(idx);

		idx = str.indexOf(" ", idx + 1);
		System.out.println(idx);

		idx = str.indexOf(" ", idx + 1);
		System.out.println(idx);
		
		idx = str.indexOf(" ", idx + 1);
		System.out.println(idx);
		
		idx = str.indexOf(" ", idx + 1);
		System.out.println(idx);
	}
}