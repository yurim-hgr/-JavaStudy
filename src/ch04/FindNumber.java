package ch04;

import java.util.Scanner;

class FindNumber {
	public static void main(String[] args) {
		int count = 0;
		int random = (int) (Math.random() * 100 + 1);
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("�Է� : ");
			int num = scan.nextInt();
			count++;
			if (random > num) {
				System.out.println("�Է°����� ŭ");
			} else if (random < num) {
				System.out.println("�Է°����� ����");
			} else {
				System.out.println("������");
				break;
			}
		}
		System.out.println("�õ��� Ƚ�� : " + count);
		scan.close();
	}
}
