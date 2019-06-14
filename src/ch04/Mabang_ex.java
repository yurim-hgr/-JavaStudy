package ch04;

public class Mabang_ex {
	public static void main(String[] args) {
		int n = 5;
		int[][] mabang = new int[n][n];
 
		// x : ������, y : ������
		// ù ��ǥ�� 
		int x = 0;
		int y = n / 2;
		mabang[x][y] = 1;

		for (int i = 2; i <= n * n; i++) {
	        // ���� ���ڸ� ���� ��ǥ (���� �밢��)
			x = x - 1;
			y = y - 1;

			if (x < 0) { // �������� �����϶�
				if (y >= 0) { // ������ 0 �̻�
		            // �������� ������ ũ�� ���� �Ʒ��� ��ǥ�� ����
					x = x + n; // x = n - 1;
				} else { // �����൵ �����϶�
					// ���� ��ġ�� �Ʒ��� ��ǥ�� ����
					y = y + 1;
					x = x + 2;
				}
			} else {
				if (y < 0) { // ������ 0 �̸�
					// �������� ������ ũ�� ���� ������ ��ǥ�� ����
					y = n - 1; // y = y + n;
				} else { // ������ ������ ����
					if (mabang[x][y] != 0) { // ���� ��ġ�� �Էµ� ���ڰ� �ִٸ�
						// ���� ��ġ�� �Ʒ��� ��ǥ�� ����
						y = y + 1;
						x = x + 2;
					}
				}
			}

			mabang[x][y] = i;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mabang[i][j] + "\t");
			}
			System.out.println();

		}
	}
}