package ch03;

import java.util.Scanner;

public class exam03_6 {
public static void main(String[] args) {
	
	  Scanner scanner = new Scanner(System.in);        
	  System.out.print("2�ڸ��� ���� �Է�(10~99)>>");         
	  
	  int n = scanner.nextInt(); //3    3 �����ڸ��� �����ڸ� ����
	  
      int ten; // 10�� �ڸ� ���� ������ ����         
      int one; // 1�� �ڸ� ���� ������ ���� 

      boolean isMatch = false; // �� �ڸ� �� �� ���� ������ ����  - �ʱ�ȭ

      /* ten ������ 10�� �ڸ� �� ���� */        
      ten = n / 10;
      /* one ������ 1�� �ڸ� �� ���� */ 
      one = n % 10;
      //�� �ڸ����� �� �ڸ����� �и��س� �� �ƴ��� �𸣴���
      
      /* isMatch ������ �� ���� �ڸ� �� �� �� ���� */     
      isMatch = ten == one;
      System.out.println(isMatch);            
      scanner.close();   
	}
}
