package ch04;

import java.util.Calendar;

public class �޷�2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		// 1. ���� ���� 1�Ϸ� ��¥ ����
		cal.set(2019, 5, 1);

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println("" + year + month + day);
		System.out.println(week);// �����

		int lastDay = cal.getActualMaximum(Calendar.DATE);

		// 1���� ���� ���� ��ġ�� �µ��� �ݺ��� �ۼ� ����
		
		//for () {}
		
		for (int d = 1; d <= lastDay; d++) {
			System.out.print(d + "\t");

			if (week % 7 == 0) { // ������̸� �ٹٲ�- 7�� ������ �������� 0�� �ȴٸ�
				System.out.println();
			}
			week++; // ���ڰ� �����ɶ� ������ ���ڵ� ���� ����
		}
	}
}