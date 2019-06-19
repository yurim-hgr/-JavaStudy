package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc3 {
public static void main(String[] args) throws ClassNotFoundException, SQLException { 
	//1. 드라이버 로딩
	Class.forName("com.mysql.jdbc.Driver");

	//2. DB접속
	String user = "root";
	String password = "mysql";
	String url = "jdbc:mysql://localhost:3306/java";
	
	Connection con = DriverManager.getConnection(url, user, password);
	System.out.println("접속 완료!");

	//3.SQL 문장 실행 준비
	String sql = "SELECT ID, PW, NAME FROM MEMBER";
	PreparedStatement stmt = con.prepareStatement(sql);
	//stmt : statement 의 약자
	//? 위치와 종류에 맞게 값 이력
	stmt.setString(1, "abc");
	stmt.setString(2, "123");
	stmt.setString(3, "홍길동");
	
	//4. SQL실행
	ResultSet rs = stmt.executeQuery();//DB값(행)반환 ,stmt앞에 변수rs를 지정
	//ResultSet ID, PW, NAME 을 표로 만들어줌 , 화살표가 생기면서 가르키는 부분을 뽑아냄
	rs.next();
	rs.next();//두개이상 있을때
	String id = rs.getString("ID");
	String pw = rs.getString("PW");
	String name = rs.getString("NAME");
	System.out.printf("%s %s %s", id , pw, name );

	
	System.out.println("실행 완료");
}
}
