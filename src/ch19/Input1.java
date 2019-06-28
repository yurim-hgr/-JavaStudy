package ch19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Input1 {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("c:/dev/test.txt");
			OutputStream out = new FileOutputStream("c:/dev/test2.txt");
			
			int data = 0;
			
//			for(int i = 0; i < 21; i++) {
			while(true) {
				data = in.read(); // ASCII Code 읽어옴
				if(data == -1) break;
				out.write(data);
				System.out.println( data );
				System.out.println( (char)data );
			}
			in.close(); // 연결된 InputStream 해제
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
