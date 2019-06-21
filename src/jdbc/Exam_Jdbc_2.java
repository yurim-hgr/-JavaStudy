package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam_Jdbc_2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String[] title = { "�ǰ���", "������", "����", "����̴�" };
		String[] content = { "Health", "is", "the", "first", "requisite", "to", "success", "in", "life" };

		// 1. ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");

		// 2. DB����
		String user = "root";
		String password = "mysql";
		String url = "jdbc:mysql://localhost:3306/java";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("���� �Ϸ�!");

		// 3.SQL ���� ���� �غ�
		String sql = "INSERT INTO EX_BOARD";
		sql = sql + " VALUES(?,?,?, NOW())";
		PreparedStatement stmt = con.prepareStatement(sql);// stmt : statement �� ����

		Exam_Jdbc_2 e = new Exam_Jdbc_2();
		for (int i = 1; i <= 100; i++) {

			String t = e.getInputData(title);
			String c = e.getInputData(content);// static�� �����;ȿ� static���� �ҷ��ü� ����.-�޼ҵ�κ�����

			// ? ��ġ�� ������ �°� �� �̷�
			stmt.setInt(1, i); // �ݺ����� 1���� �Ǵϱ� �ߺ�����
			stmt.setString(2, t);
			stmt.setString(3, c);

			// 4. SQL����
			stmt.executeUpdate();
	
			// getInputData() �޼ҵ带 �̿��Ͽ� �迭�� ����
			// EX_BOARD ���̺� BRD_NO, BRD_TIT, BRD_CON, BRD_DATE ������ ����
		}		System.out.println("���� �Ϸ�");
	}

	private String getInputData(String[] data) {
		// �������� ����

		int num = (int) (Math.random() * data.length);// ������ �迭�� ���̱������ϱ� ,int������ȯ�ؼ� �Ҽ��� ����
		return data[num];
	}
}