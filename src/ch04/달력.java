package ch04;

import java.util.Calendar;

public class �޷� {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		// 1. ���� ��¥ ���� �˾Ƴ���
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);

		System.out.println("" + year + month + day);

		// 2. ��¥ �����ϱ�
		cal.set(2012, 2, 27);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		day = cal.get(Calendar.DATE);
		
		System.out.println("" + year + month + day);
		
		// 3.��¥ ���ϱ�(����) D-Day
		cal.add(Calendar.DATE, 3000);//-3000�ϸ� ����
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		day = cal.get(Calendar.DATE);
		
		System.out.println("" + year + month + day);
		
		//4. ���� ���� ������ ��¥ ���ϱ�
		int lastDay = cal.getActualMaximum(Calendar.DATE);
	    System.out.println(lastDay);
		
	}
}
