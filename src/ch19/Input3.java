package ch19;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Input3 {
	// Shift + Ctrl + O
	public static void main(String[] args) throws IOException {
		// 위 3줄 코드를 써야만 하는 이유
		// 1. 한글과 같은 2byte 문자들을 깨지지 않게 처리하기 위해서
		//    BufferedReader <- readLine() 한줄씩 읽어들임
		// 2. 읽어들인 내용이 다양한 인코딩 방식을 쓸수 있는데
		//    그 인코딩 방식을 지정하기 위해서
		//    InputStreamReader <- 생성자로 인코딩 방식 지정
		// 3. 여러 라이브러리를 사용하여 데이터를 읽을 때
		//    읽어들인 결과는 항상 InputStream 으로 나옴
		InputStream in = new FileInputStream("c:/dev/test.txt");
		InputStreamReader isr = new InputStreamReader(in, "ms949");
		BufferedReader reader = new BufferedReader(isr);
		
		while(true) {
			String data = reader.readLine();
			if(data == null) break;
			System.out.println(data);
		}
	}
}





