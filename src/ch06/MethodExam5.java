package ch06;

public class MethodExam5 {
	public static void main(String[] args) {
		int num1 = 10;//�⺻�ڷ��� 
		int num2 = 10;
		System.out.println(num1 == num2);

		int[] nums1 = { 1, 2 };// �����ڷ��� (�������� s����)
		int[] nums2 = { 1, 2 };//�Ӷ�� �Է��ϴ����� �Ȱ��� �ڸ����� ����- SHA ��ȣ�ؽ��ڵ�
		System.out.println("���� ��");
		System.out.println(nums2[1]);//1
				
		nums1 = nums2;
		System.out.println("���� ��");
		nums1[1] = 999;
		System.out.println(nums2[1]);//999
	}
}