package ch06;

public class Exam6_2 {
	// ������ ���԰� 10kgkg�� ������ 1���, 7kgkg�� ������ 2���, 4kgkg�� ������ 3���,
	// �������� 4kg����� �ο��ϴ� checkGrade �޼ҵ� �����

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
