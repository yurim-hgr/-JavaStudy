package ch19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Input2 {
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream("c:/dev/test.bin");
			out = new FileOutputStream("c:/dev/test2.bin");
			
			int data = 0;
			byte[] buffer = new byte[1024];
			
//			for(int i = 0; i < 21; i++) {
			while(true) {
				data = in.read(buffer); // ASCII Code 佬绢咳
				if(data == -1) break;
				out.write(buffer);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 楷搬等 InputStream 秦力
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}


