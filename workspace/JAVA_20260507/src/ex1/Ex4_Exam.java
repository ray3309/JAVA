package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex4_Exam {
	public static void main(String[] args) {
		// Connection 인터페이스의 객체 변수 선언

		// DB Url 변수
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "mytess2";
		String pwd = "mytess2";

		// binding => ?, 시작은 1 부터
		// String sql = "INSERT INTO freeboard VALUES (freeboard_seq.nextVal, '제목1',
		// '희상', '안녕하세요 윤희상입니다1.', '1234', 0, SYSDATE)";
		String sql = "INSERT INTO freeboard VALUES (freeboard_seq.nextVal, ?, ?, ?, ?, 0, SYSDATE)";

		try(Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			Scanner sc = new Scanner(System.in);) {
			// JDBC 드라이버를 메모리에 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			
			System.out.println("제목을 입력 : ");
			String sTitle = sc.nextLine();
			System.out.println("작성자를 입력 : ");
			String sWriter = sc.nextLine();
			System.out.println("내용을 입력 : ");
			String sConts = sc.nextLine();
			System.out.println("패스워드를 입력 : ");
			String sPwd = sc.nextLine();			
			System.out.println(conn);

			// 값과 변수를 바인딩 처리
			pstmt.setString(1, sTitle);
			pstmt.setString(2, sWriter);
			pstmt.setString(3, sConts);
			pstmt.setString(4, sPwd);

			String msg = (pstmt.executeUpdate() > 0) ? "추가 성공!!" : "추가 실패!!";

			System.out.println(msg);		
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
