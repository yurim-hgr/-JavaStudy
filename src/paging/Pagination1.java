package paging;

public class Pagination1 {
	public static void main(String[] args) {
		// ���� �������� ��ȣ
		int nowPage = 7;
		// ������ �̵��� ���� ǥ���Ǵ� �������� ���� ��ȣ
		int startPage = 0;

		// ������ �̵��� ���� ǥ���Ǵ� �������� �� ��ȣ
		int endPage = 0;
		int showNum = 10;
		/* �ڵ� �ۼ� */

		startPage = nowPage / 10 * 10 + 1;
		if (nowPage % 10 == 0) {
			startPage = startPage - 10;
		}
		endPage = startPage + 9;

		for (int i = startPage; i <= endPage; i++) {
			if (i == nowPage) {
				System.out.print("[" + i + "] ");
			} else {
				System.out.print(i + " ");
			}
		}
	}
}