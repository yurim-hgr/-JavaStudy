package ch04;

import java.util.Random;
import java.util.Scanner;

public class ����������2 {
public static void main(String[] args) {
	//���� 0 ���� 1 �� 2
	
	Scanner s = new Scanner(System.in);
	System.out.println("���� 0 ���� 1 �� 2 �� �Է����ּ���.");
	
	int �� = s.nextInt();//����1
	
	// 0 ~ 2 ���� ���� �������� ����
	// ��� 1 Math.random() 0.0<= ran < 1.0
	double ran = Math.random() *3; //0.0 ~ 2.999
			
	// ��� 2 Random
	Random random = new Random();
	int ran2 = random.nextInt(3); // 0~2
	
	int ���� = 1;//����
	
	System.out.println("������ ������ : " + ����);
	if(�� + 1 == ����) { //���� ��
		System.out.println("��");
		
	}else { 
		if(�� == ����) {//���
			System.out.println("���");
		}else {//���� �̱�
			System.out.println("�̱�");
		}
	}
	
}
}
