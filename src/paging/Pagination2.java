package paging;

public class Pagination2 {
	public static void main(String[] args) {
		// ���� �������� ��ȣ
		int nowPage = 2;
		// ������ �̵��� ���� ǥ���Ǵ� �������� ���� ��ȣ
		int startPage = 0;
		// ������ �̵��� ���� ǥ���Ǵ� �������� �� ��ȣ
		int endPage = 0;
		/* �ڵ� �ۼ� */

		startPage = nowPage / 10 * 10 + 1;
		//��� 1
		if (nowPage % 10 == 0) {
			startPage = startPage - 10;
	   //��� 2
//     	startPage = (nowPage-1) / 10 * 10 + 1;
			
		}
		endPage = startPage + 9;

		int totalNumber = 57; //DB�� ����Ǿ��ִ� ������(�Խù�)�Ǽ�-6������, 57�������Ϸ��� 570���� �Է�
		int realEndPage = totalNumber / 10;
		if(totalNumber % 10 != 0) {//11 54 131
			realEndPage++;
		}
		if (endPage > realEndPage) {
			endPage =realEndPage;
		}
	
		for (int i = startPage; i <= endPage; i++) {
			if (i == nowPage) {
				System.out.print("[" + i + "] ");
			} else {
				System.out.print(i + " ");
			}
		}
	}
}