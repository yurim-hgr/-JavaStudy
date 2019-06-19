package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");

		// 2. DB����
		String user = "root";
		String password = "mysql";
		String url = "jdbc:mysql://localhost:3306/java";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("���� �Ϸ�!");

		// 3.SQL ���� ���� �غ�
		String sql = "";
		sql += "SELECT * FROM EMP ";

		PreparedStatement stmt = con.prepareStatement(sql);

		// 4. SQL����
		ResultSet rs = stmt.executeQuery();// DB��(��)��ȯ ,stmt�տ� ����rs�� ����
		// ResultSet ID, PW, NAME�� ǥ�� ������� , ȭ��ǥ�� ����鼭 ����Ű�� �κ��� �̾Ƴ�
//		for (int i = 0; i < 14; i++) {
	//		rs.next(); // 1��° �� ������
		while(rs.next()) {
			String empno = rs.getString("EMPNO");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			String mgr = rs.getString("mgr");
			String hiredate = rs.getString("hiredate");
			String sal = rs.getString("sal");
			String comm = rs.getString("comm");
			String deptno = rs.getString("deptno");

			System.out.printf("%s %s \n", empno, ename);

		}
	}
}