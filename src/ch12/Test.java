package ch12;

public class Test{
	public static void main(String[] args) {
		//���ͷ� ������� ����
		String s1 = "A";
		String s2 = "A";
		System.out.println(s1 == s2);
		
		//new����
		String s3 = new String("A");
		String s4 = new String("A");
		System.out.println(s3 == s4);
		
		System.out.println(s1 == s4);
	}
}