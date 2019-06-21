package ch12;

public class Split {
	public static void main(String[] args) {
		//                  ^   ^
		String str = "Java Secure Coding";//e를 기준으로 끊어주고 e는 없어짐
		String[] strs = str.split("e");
		for (String s : strs) {
			System.out.println(s);
		}
	}
}