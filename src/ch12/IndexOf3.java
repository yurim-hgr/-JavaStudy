package ch12;

public class IndexOf3 {
	public static void main(String args[]) {
		// 01234567890123456789
		String text = "Lorem Ipsum is simply dummy text of" + " the printing and typesetting industry."
				+ " Lorem Ipsum has been the industry's standard" + " dummy text ever since the 1500s, when an unknown "
				+ "printer took a galley of type and scrambled it to" + " make a type specimen book. It has survived "
				+ "not only five centuries, but also the leap into " + "electronic typesetting, remaining essentially"
				+ " unchanged. It was popularised in the 1960s" + " with the release of Letraset sheets containing"
				+ " Lorem Ipsum passages, and more recently with " + "desktop publishing software like Aldus PageMaker"
				+ " including versions of Lorem Ipsum.";

		// lorem 단어 개수과 ipsum 단어개수

		int idx1 = 0;// lorem index
		int idx2 = 0;// ipsum index
		int lorem = 0;
		int ipsum = 0;

		while (true) {
			if (idx1 != -1) {
				idx1 = text.indexOf("Lorem", idx1 + 1);
				lorem++;
			}
			if (idx2 != -1) {
				idx2 = text.indexOf("Ipsum", idx2 + 1);
				ipsum++;
			}

			if (idx1 == -1 && idx2 == -1)
				break;
		}
		System.out.printf("Lorem %d, Ipsum %d", lorem, ipsum);
	}
}