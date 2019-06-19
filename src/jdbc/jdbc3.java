package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc3 {
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
	String sql = "SELECT ID, PW, NAME FROM MEMBER";
	PreparedStatement stmt = con.prepareStatement(sql);
	//stmt : statement �� ����
	//? ��ġ�� ������ �°� �� �̷�
	stmt.setString(1, "abc");
	stmt.setString(2, "123");
	stmt.setString(3, "ȫ�浿");
	
	//4. SQL����
	ResultSet rs = stmt.executeQuery();//DB��(��)��ȯ ,stmt�տ� ����rs�� ����
	//ResultSet ID, PW, NAME �� ǥ�� ������� , ȭ��ǥ�� ����鼭 ����Ű�� �κ��� �̾Ƴ�
	rs.next();
	rs.next();//�ΰ��̻� ������
	String id = rs.getString("ID");
	String pw = rs.getString("PW");
	String name = rs.getString("NAME");
	System.out.printf("%s %s %s", id , pw, name );

	
	System.out.println("���� �Ϸ�");
}
}
