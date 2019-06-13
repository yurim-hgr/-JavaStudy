package ch06;

public class Exam6_3 {
	public static void main(String[] args) {
	int day = getLastYear(2);
	System.out.println(day);
	
//	int sum = getBetweenSum(3, 3);
//	System.out.println(sum);
	
//	int grade = checkGrade(20);
//	System.out.println(grade + "���");
	
//	String result = dilemma(true, true);
//	System.out.println(result);
}
	/*
	 * ���ǿ� �ش��ϴ� dilemma �޼ҵ� ����� ���� ) ������ A, B�� ü���Ǿ� ���� �ٸ� �����ǿ��� �ݸ��Ǿ� �ɹ��� �ް� ���� �� ����
	 * �ڹ� ���ο� ���� ���� �Ǵ� �����Ⱓ�� ������ ���� 1) �� �� �ϳ��� ����Ͽ� �˸� �ڹ��ϸ� �ڹ��� ����� ��� ����ǰ� ��������
	 * 10kg���� ���� ���� 2) �� ��� ���� ����Ͽ� �˸� �ڹ��ϸ� �� �� 5���� ���� ���� 3) �� ��� �˸� �ڹ����� ������ �� ��
	 * 1���� ���� ���� 4kg) �����ڸ� ��Ÿ���� ���� xa, xb�� �ڹ��ϸ� true, �׷��� ������ false�� ����
	 */
	static String dilemma(boolean a, boolean b) {
		if (a && b) {
			return "5��";
		} else if (!a && !b) {
			return "1��";
		} else if (a && !b) {
			return "a ����, b 10��";
		} else if (!a && b) {
			return "a 10��, b ����";
		}

		return "";
	}

	// 1 / 3 / 5 / 7kg / 8 / 10kg / 12���� 31��, 4kg / 6 / 9 / 11���� 30kg��, 2���� 28�ϱ��� ����
	// Ư�� ���� �Է��ϸ� �ش��ϴ� ���� ��¥ ���� ��ȯ�ϴ� getLastYear �޼ҵ� �����
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

	// �� ���� ���� a, b�� �ԷµǾ��� �� a �� b ���̿� ���� ��� ������ ���� ��ȯ�ϴ�
	// getBetweenSum �޼ҵ� �����
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