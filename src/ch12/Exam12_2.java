package ch12;

public class Exam12_2 {
	//split
	public static void main(String[] args) {
		String file = "/home/temp/Java.class";
		// �ڵ� �ۼ�
		String[] path = file.split("/");
		for (int i = 0; i < path.length; i++) {
			if (path[i].equals("")) {
			} else {
				System.out.println("/" + path[i]);
			}
		}

	}
}