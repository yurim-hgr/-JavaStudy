package ch11;

import java.util.Scanner;

import ch11.net.A;
import ch11.print.B;

public class Main2 {
	public static void main(String[] args) {// ũ�Ѹ�: ������Ʈ�� �˻����� �� ������ ����� �ܾ���°�
		
		NetworkUtil nu = new NetworkUtil();
		String result =
				nu.get("https://dhlottery.co.kr/gameResult.do?method=byWin&wiselog=H_C_1_1");
				System.out.println(result);
				
	}
}
