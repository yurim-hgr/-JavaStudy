package ch02;  

import java.util.Scanner;

public class Variable_Scanner {
	public static void main(String[] args) {
		//ctrl + F11 : Ŭ���� ����
		//���̺귯�� ,library
		Scanner s = new Scanner(System.in );
		System.out.println( "���ڸ� �Է����ּ���.");
		
		//���� �Է�
		int n = s.nextInt(); //Ű�����Է� ���� ��������
		System.out.println("�Էµ� ���� " + n);
		System.out.println(  (char) n);
		
		
		//���� �Է�
		String text = s.next();
		System.out.println("�Էµ� ���� " + text);
	}
}
	