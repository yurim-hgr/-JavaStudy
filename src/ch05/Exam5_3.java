package ch05;

public class Exam5_3 {
	public static void main(String[] args) {
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		// 1. for�� �迭 ��Ҹ� �����ֱ����� ���
		for (int i = 0; i < nums.length; i++) {

			char temp = ' ';
			int idx = (int) (Math.random() * nums.length);
			temp = nums[0];
			nums[0] = nums[idx];
			nums[idx] = temp;
		}
		// 2. for���迭 ��Ҹ� ������ֱ����� ���- ����ó�� �ٸ��ٶ��� ������ �ݺ��� (for��)
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
			if ((i + 1) % 3 == 0) {
				System.out.println();
			}
		}
	}
}
