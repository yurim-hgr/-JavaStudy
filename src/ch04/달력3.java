package ch04;

import java.util.Calendar;
import java.util.Scanner;

public class �޷�3 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		// 1. ���� ���� 1�Ϸ� ��¥ ����
		
		Scanner s = new Scanner(System.in);
		System.out.println("�� �� �Է�");

		int year = s.nextInt();
		int month = s.nextInt() - 1;
				
		cal.set(year, month, 1);

		int day = cal.get(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println("" + year + month + day);
		System.out.println(week);// �����

		int lastDay = cal.getActualMaximum(Calendar.DATE);

		// 1���� ���� ���� ��ġ�� �µ��� �ݺ��� �ۼ� ����
		
		for (int i = 1; i < week; i++) {
			System.out.print("\t");
		}
		
		for (int d = 1; d <= lastDay; d++) {
			System.out.print(d + "\t");

			if (week % 7 == 0) { // ������̸� �ٹٲ�- 7�� ������ �������� 0�� �ȴٸ�
				System.out.println();
			}
			week++; // ���ڰ� �����ɶ� ������ ���ڵ� ���� ����
		}
	}
}