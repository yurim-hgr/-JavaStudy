package ch05;

public class Method2 {
	static boolean signUp(String id, String pw) {
		// ID 자리수 검사
		if (id.length() < 4) {
			return false;
		}
		if (pw.length() < 4) {
			return false;
		}
		// pw 자리수 검사
		return true;
	}

	public static void main(String[] args) {
		boolean result = signUp("abcd", "123");
		if (result) { // if(result==true)
			System.out.println("가입성공");
		} else {
			System.out.println("가입 실패");
		}
	}
}
