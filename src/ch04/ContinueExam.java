package ch04;

import java.io.File;

public class ContinueExam {
	public static void main(String[] args) {
		File file = new File("C:\\Windows\\System32\\drivers\\etc");
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			long fileSize = files[i].length();
			if (fileSize < 1000) { // ����ũ�Ⱑ 1000Byte �̸��̸� �Ʒ� �ڵ� ����
				continue;
			}
			System.out.println(files[i].getName() + " / " + fileSize);
		}
	}
}