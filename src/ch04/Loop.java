package ch04;

public class Loop {
	public static void main(String[] args) {
		//초기값 ; 조건식 ; 증감식 i = i + 1 , i++
		//        1번           2번           4번
		for( int i = 1 ; i <= 5 ; i++ )
		{
			// 3번
			// 1번-2 - 3 - 4 - 2 - 3 - 4 - 2 - ...2번때 멈춤
			// i는 6일때 탈출
		}
	}
}

