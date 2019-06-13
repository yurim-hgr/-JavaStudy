package ch06;

public class MethodExam5 {
	public static void main(String[] args) {
		int num1 = 10;//기본자료형 
		int num2 = 10;
		System.out.println(num1 == num2);

		int[] nums1 = { 1, 2 };// 참조자료형 (변수에서 s차이)
		int[] nums2 = { 1, 2 };//머라고 입력하던간에 똑같은 자리수로 해줌- SHA 암호해시코드
		System.out.println("변경 전");
		System.out.println(nums2[1]);//1
				
		nums1 = nums2;
		System.out.println("변경 후");
		nums1[1] = 999;
		System.out.println(nums2[1]);//999
	}
}