package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException { 
	//1. ����̹� �ε�
	Class.forName("com.mysql.jdbc.Driver");

	//2. DB����
	String user = "root";
	String password = "mysql";
	String url = "jdbc:mysql://localhost:3306/java";
	
	Connection con = DriverManager.getConnection(url, user, password);
	System.out.println("���� �Ϸ�!");

	//3.SQL ���� ���� �غ�
	String sql = "INSERT INTO MEMBER(ID,PW,NAME)";
	sql = sql+ "VALUES(?,?,?)";
	PreparedStatement stmt = con.prepareStatement(sql);
	//stmt : statement �� ����
	//? ��ġ�� ������ �°� �� �̷�
	stmt.setString(1, "abc");
	stmt.setString(2, "123");
	stmt.setString(3, "ȫ�浿");
	
	//4. SQL����
	stmt.executeUpdate();
	System.out.println("���� �Ϸ�");
}
}
