package ch05;

public interface Mabang {

	public static void main(String[] args) {
		// ������ ���ڸ� ������ 2���� �迭 5*5

		int[][] mabang = new int[7][7];
	
		int row = 0;
		int col = 7/2;
		// ��Ģ 1
		mabang[row][col] = 1;
	

		// 2~25 ���� �ݺ�
		for (int i = 2; i <= 7*7 ; i++) {
			row = row - 1;// 1�� ����
			col = col - 1;// 1�� ����

			// ���� ������ �Ǿ�����
			if (row < 0) {
				// ���� ������ �Ǿ����� 15�� �밢���� ���
				if (col < 0) {
					row = row + 2;
					col = col + 1;
					// ���� �����϶�
				} else {
					row = 7- 1; // row 5 + row
				}

				// ���� �����϶�
			} else {
				// ���� ������ �Ǿ�����
				if (col < 0) {
					col = 7 - 1;

					// ���� ������ ��
				} else {
					if (mabang[row][col] > 0) {
						row = row + 2;
						col = col + 1;
					}

				}
			}

			mabang[row][col] = i;

		} // end for

		for (int i = 0; i < 7; i++) {

			for (int j = 0; j < 7; j++) {
				System.out.print(mabang[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
