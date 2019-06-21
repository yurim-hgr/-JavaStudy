package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam_Jdbc_2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String[] title = { "건강은", "성공의", "제일", "요건이다" };
		String[] content = { "Health", "is", "the", "first", "requisite", "to", "success", "in", "life" };

		// 1. 드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver");

		// 2. DB접속
		String user = "root";
		String password = "mysql";
		String url = "jdbc:mysql://localhost:3306/java";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("접속 완료!");

		// 3.SQL 문장 실행 준비
		String sql = "INSERT INTO EX_BOARD";
		sql = sql + " VALUES(?,?,?, NOW())";
		PreparedStatement stmt = con.prepareStatement(sql);// stmt : statement 의 약자

		Exam_Jdbc_2 e = new Exam_Jdbc_2();
		for (int i = 1; i <= 100; i++) {

			String t = e.getInputData(title);
			String c = e.getInputData(content);// static이 붙은것안에 static없이 불러올수 없다.-메소드부분참조

			// ? 위치와 종류에 맞게 값 이력
			stmt.setInt(1, i); // 반복문이 1부터 되니까 중복없이
			stmt.setString(2, t);
			stmt.setString(3, c);

			// 4. SQL실행
			stmt.executeUpdate();
	
			// getInputData() 메소드를 이용하여 배열값 추출
			// EX_BOARD 테이블에 BRD_NO, BRD_TIT, BRD_CON, BRD_DATE 데이터 삽입
		}		System.out.println("실행 완료");
	}

	private String getInputData(String[] data) {
		// 랜덤숫자 생성

		int num = (int) (Math.random() * data.length);// 랜덤에 배열의 길이까지곱하기 ,int로형변환해서 소수점 없음
		return data[num];
	}
}