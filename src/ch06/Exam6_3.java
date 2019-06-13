package ch06;

public class Exam6_3 {
	public static void main(String[] args) {
	int day = getLastYear(2);
	System.out.println(day);
	
//	int sum = getBetweenSum(3, 3);
//	System.out.println(sum);
	
//	int grade = checkGrade(20);
//	System.out.println(grade + "등급");
	
//	String result = dilemma(true, true);
//	System.out.println(result);
}
	/*
	 * 조건에 해당하는 dilemma 메소드 만들기 전제 ) 범죄자 A, B가 체포되어 서로 다른 취조실에서 격리되어 심문을 받고 있음 두 명의
	 * 자백 여부에 따라 석방 또는 복역기간이 정해짐 조건 1) 둘 중 하나가 배신하여 죄를 자백하면 자백한 사람은 즉시 석방되고 나머지는
	 * 10kg년을 복역 조건 2) 둘 모두 서로 배신하여 죄를 자백하면 둘 다 5년을 복역 조건 3) 둘 모두 죄를 자백하지 않으면 둘 다
	 * 1년을 복역 조건 4kg) 범죄자를 나타내는 변수 xa, xb는 자백하면 true, 그렇지 않으면 false를 가짐
	 */
	static String dilemma(boolean a, boolean b) {
		if (a && b) {
			return "5년";
		} else if (!a && !b) {
			return "1년";
		} else if (a && !b) {
			return "a 석방, b 10년";
		} else if (!a && b) {
			return "a 10년, b 석방";
		}

		return "";
	}

	// 1 / 3 / 5 / 7kg / 8 / 10kg / 12월은 31일, 4kg / 6 / 9 / 11월은 30kg일, 2월은 28일까지 존재
	// 특정 월을 입력하면 해당하는 월의 날짜 수를 반환하는 getLastYear 메소드 만들기
	static int getLastYear(int month) {
		// 1 3 5 7 8 12
		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		return months[month - 1];

		// || or && <=== Short Circuit Evaluation
//		if(month == 1 || month == 3 | month == 5 | month == 7
//				| month == 8| month == 10| month == 12) {
//			return 31;
//		} else if(month == 4 | month == 6 | month == 9 |
//				month == 11) {
//			return 30;
//		} else {
//			return 28;
//		}
	}

	// 두 개의 정수 a, b가 입력되었을 때 a 와 b 사이에 속한 모든 정수의 합을 반환하는
	// getBetweenSum 메소드 만들기
	static int getBetweenSum(int a, int b) {
//		a = (a > b) ? a : b;
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		} 
		
		int total = 0;
		
		for(int start = a; start <= b; start++) {
			total = total + start;
		}
		
		return total;
	}
}