package ch12;

public class IndexOf2 {
	public static void main(String args[]) {
		// 01234567890123456789
		String str = "Java ������ �缺�� ���� ����������!!";

		int idx = 0;
		while (true) {
			idx = str.indexOf(" ", idx + 1);

			if (idx == -1) {
				break;
			}
		
		System.out.println(idx);
		}
	}
}