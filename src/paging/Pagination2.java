package paging;

public class Pagination2 {
	public static void main(String[] args) {
		// 현재 페이지의 번호
		int nowPage = 2;
		// 페이지 이동을 위해 표현되는 페이지의 시작 번호
		int startPage = 0;
		// 페이지 이동을 위해 표현되는 페이지의 끝 번호
		int endPage = 0;
		/* 코드 작성 */

		startPage = nowPage / 10 * 10 + 1;
		//방법 1
		if (nowPage % 10 == 0) {
			startPage = startPage - 10;
	   //방법 2
//     	startPage = (nowPage-1) / 10 * 10 + 1;
			
		}
		endPage = startPage + 9;

		int totalNumber = 57; //DB에 저장되어있는 데이터(게시물)건수-6페이지, 57페이지하려면 570개를 입력
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