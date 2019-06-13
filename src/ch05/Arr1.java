package ch05;

public class Arr1 {
	public static void main(String[] args) {
		// 5개 공간의 배열 생성
		int[] arr = new int[5]; // 000 300 0
		arr[3] = 300;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[1]);

			// ctrl +/ : 주석 또는 shift + ctrl + c
//		System.out.println(arr[0]);
//   	System.out.println(arr[3]);
//		System.out.println(arr[9]);//Index Error!- 인덱스 : 어떤위치에 어떤게 적혀있는지 ex)0번에 몇
		}// 인덱스안에 꺼는 element 요소라고 함
	}
}