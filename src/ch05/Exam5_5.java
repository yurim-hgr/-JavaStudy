package ch05;
public class Exam5_5 {
	//배열의 항목 합과 평균값 구하기
 public static void main(String[] args) {
 int[][] arr = {
 {95, 86},
 {83, 92, 96},
 {78, 83, 93, 87, 88}
 };

 int sum = 0;
 double avg = 0.0;
 int count = 0;
 
for(int row = 0; row < arr.length; row++) {
	for(int col = 0; col < arr[row].length; col++){
		sum += arr[row][col];
		count++;
	}	
}
	avg = (double)sum/ count;
	
 System.out.println("합 : " + sum);
 System.out.println("평균 : " + avg);
 }
}