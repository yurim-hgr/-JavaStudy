package ch08;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {

	public Window() {

	}

	public Window(int a) { // ������

	}

	public static void main(String[] args) {
		// ������ ȣ�� -> �ν��Ͻ� ���� -> Ŭ������ ����ϱ� ���ؼ�
		Window w = new Window();

		JFrame frame = new JFrame();
		frame.setTitle("������@@@@@");

		// TODO ���� �ٲٱ�
		JButton btn = new JButton();
		btn.setText("��ư!");
		btn.setBackground(Color.RED);

		frame.add(btn);

		frame.setBounds(200, 200, 200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}
