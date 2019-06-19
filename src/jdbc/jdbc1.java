package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc1 {
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
	String sql = "INSERT INTO MEMBER(ID,PW,NAME)";
	sql = sql+ "VALUES(?,?,?)";
	PreparedStatement stmt = con.prepareStatement(sql);
	//stmt : statement 의 약자
	//? 위치와 종류에 맞게 값 이력
	stmt.setString(1, "abc");
	stmt.setString(2, "123");
	stmt.setString(3, "홍길동");
	
	//4. SQL실행
	stmt.executeUpdate();
	System.out.println("실행 완료");
}
}
