package ch08;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {

	public Window() {

	}

	public Window(int a) { // 생성자

	}

	public static void main(String[] args) {
		// 생성자 호출 -> 인스턴스 생성 -> 클래스를 사용하기 위해서
		Window w = new Window();

		JFrame frame = new JFrame();
		frame.setTitle("윈도우@@@@@");

		// TODO 색상 바꾸기
		JButton btn = new JButton();
		btn.setText("버튼!");
		btn.setBackground(Color.RED);

		frame.add(btn);

		frame.setBounds(200, 200, 200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}
