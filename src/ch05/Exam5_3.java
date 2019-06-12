package ch05;

public class Exam5_3 {
	public static void main(String[] args) {
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		// 1. for문 배열 요소를 섞어주기위한 기능
		for (int i = 0; i < nums.length; i++) {

			char temp = ' ';
			int idx = (int) (Math.random() * nums.length);
			temp = nums[0];
			nums[0] = nums[idx];
			nums[idx] = temp;
		}
		// 2. for문배열 요소를 출력해주기위한 기능- 빙고처럼 꾸며줄때는 무조건 반복문 (for문)
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
			if ((i + 1) % 3 == 0) {
				System.out.println();
			}
		}
	}
}
