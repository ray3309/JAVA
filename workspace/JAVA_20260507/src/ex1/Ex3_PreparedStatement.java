package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex3_PreparedStatement {
	public static void main(String[] args) {	
		// DB Url 변수
		String url = "jdbc:oracle:thin:@192.168.0.3:1521:xe";
		String user = "ray3309";
		String pwd = "yhs8281";		
		String sql = "INSERT INTO freeboard VALUES (freeboard_seq.nextVal, ?, ?, ?, ?, 0, SYSDATE)";
		
		// try~with~resources 처리
		try(Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			// JDBC 드라이버를 메모리에 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			System.out.println("드라이버 로딩 성공!");
			
			String sTitle = "테스형 수고";
			String sWriter = "테스형11";
			String sConts = "테스형 수고2";
			String sPwd = "5454";
			
			System.out.println(conn);
			
			// 값과 변수를 바인딩 처리
			pstmt.setString(1, sTitle);
			pstmt.setString(2, sWriter);
			pstmt.setString(3, sConts);
			pstmt.setString(4, sPwd);
			
			String msg = (pstmt.executeUpdate() > 0) ? "추가 성공!!" : "추가 실패!!" ;
			
			System.out.println(msg);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
