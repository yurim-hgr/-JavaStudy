package ch06;

public class Exam6_2 {
	// 수박의 무게가 10kgkg이 넘으면 1등급, 7kgkg이 넘으면 2등급, 4kgkg이 넘으면 3등급,
	// 나머지는 4kg등급을 부여하는 checkGrade 메소드 만들기

	static int chechGrade(int weight) {
		if (weight > 10) {
			return 1;
		} else if (weight > 7) {
			return 2;
		} else if (weight > 4) {
			return 3;
		}
		    return 4;

	}
}
