package ch07;
 
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
 
public class GetImage {
 
    public static void main(String[] args){
 
        GetImage getImage = new GetImage();
 
        String strUrl = "https://nesoy.github.io/assets/logo/Java.jpg"; //�ҷ��� URL
        // url ���ͳ� �ּ�
        try {
 
            getImage.saveImage(strUrl);
            //saveImage��� �޼ҵ�
        } catch (IOException e) {
 
            e.printStackTrace();
 
        }
 
    }
 
    private void saveImage(String strUrl) throws IOException {
    	//shift+ctrl +o-���� ����Ʈ�� ���� �ϴ°�
        URL url = null;
        InputStream in = null;
        OutputStream out = null; 
 
        try {
 
            url = new URL(strUrl);
 
            in = url.openStream();
 
            out = new FileOutputStream("C:/dev/test2.jpg"); //�� �ϵ��ũ�� ������
 
            while(true){
                //�̹����� �о�´�.
                int data = in.read();
                if(data == -1){
                    break;
                }
                //�̹����� ����.
                out.write(data);
 
            }
 
            in.close();
            out.close();
 
        } catch (Exception e) {
 
            e.printStackTrace();
 
        }finally{
 
            if(in != null){in.close();}
            if(out != null){out.close();}
 
        }
    }
 
}