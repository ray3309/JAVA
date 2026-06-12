package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//select 일대 오라클의 결과(ResultSet)를 받아주는 자바

public class Ex2_ResultSet {

	public static void main(String[] args) {
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String sql = "select num,title,writer,conts,hit,fredate from freeboard order by 1 desc";
		String url = "jdbc:oracle:thin:@192.168.0.3:1521:xe";
		String user = "ray3309";
		String pwd = "yhs8281";
		
		try(Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			// 검색 쿼리의 결과를 ResultSet으로 반환
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("num"));
				System.out.println(rs.getString("title"));
				System.out.println(rs.getString("conts"));
				System.out.println(rs.getInt("hit"));
				System.out.println(rs.getString("fredate"));
				
				System.out.println("--------------------------");				
			}
		} catch (SQLException e) {
			e.printStackTrace();			
		}
		
	}
}
