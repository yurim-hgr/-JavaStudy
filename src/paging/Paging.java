package paging;

public class Paging {
	public static void main(String[] args) {
		//���� �������� ��ȣ�� �ش��ϴ� �Խù��� ���� / �� ��ȣ ���
		
		// ���� �������� ��ȣ
		int nowPage = 5;
		// ���� ���������� ������ �Խù��� ���� ��ȣ
		int startNum = 0;
		// ���� ���������� ������ �Խù��� �� ��ȣ
		int endNum = 0;
		int showNum = 10;
		/* �ڵ� �ۼ� */
		
		endNum = nowPage * showNum;
	    startNum = endNum - (showNum - 1);
	    
		System.out.println("���� ������ : " + nowPage);
		System.out.println("���� ��ȣ : " + startNum);
		System.out.println("�� ��ȣ : " + endNum);
	}
}