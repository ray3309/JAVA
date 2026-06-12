package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex1_ConnectionTest {

	public static void main(String[] args) {
		
		// Connection 인터페이스의 객체 변수 선언
		Connection conn = null;
		
		// DB Url 변수
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "mytess2";
		String pwd = "mytess2";
		
		// SQL 문자 객체 변수
		@SuppressWarnings("unused")
		Statement stmt = null;
		@SuppressWarnings("unused")
		PreparedStatement pstmt = null;
		@SuppressWarnings("unused")
		Statement stmt2 = null;
		@SuppressWarnings("unused")
		ResultSet rs = null;
		@SuppressWarnings("unused")
		String sql = "";
		
		// 1. 드라이버 로드
		try {
			
			// JDBC 드라이버를 메모리에 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			
			// 접속한 DB 정보로 Connection 객체 생성
			// 2티어와 3티어의 차이 Connection 관리(중간 미들웨어)
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println(conn);		
			
			// Statement 객체 생성
			stmt = conn.createStatement();
			
			// 테이블 생성 SQL			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
