package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex3_UpDelete {
	
	static {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void UpdateDemo() {
		String sql = "Update freeboard Set title=?, writer=?, conts=?, hit=?, pwd=? Where num=?";		
		String url = "jdbc:oracle:thin:@192.168.0.3:1521:xe";
		String user = "ray3309";
		String dbpwd = "yhs8281";
		
		try(Connection conn = DriverManager.getConnection(url, user, dbpwd);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			Scanner sc = new Scanner(System.in)){
			
			System.out.println("변경할 타이틀명 : ");
			pstmt.setString(1, sc.nextLine());					// title의 값(변경할것)
			
			System.out.println("변경할 작성자명 : ");
			pstmt.setString(2, sc.nextLine());					// writer의 값(변경할것)
			
			System.out.println("변경할 내용 : ");
			pstmt.setString(3, sc.nextLine());					// conts의 값(변경할것)
			
			System.out.println("변경할 조회수 : ");
			pstmt.setInt(4, Integer.parseInt(sc.nextLine()));	// hit의 값(변경할것)
			
			System.out.println("변경할 패스워드 : ");
			pstmt.setString(5, sc.nextLine());					// pwd(변경할것)
			
			System.out.println("변경할 조건에 해당하는 게시물 번호 : ");
			pstmt.setInt(6, Integer.parseInt(sc.nextLine()));	// num조건(변경할것)
			
			int res = pstmt.executeUpdate();
			
			String msg = (res > 0) ? "수정 성공" : "수정 실패";
			System.out.println(msg);
						
		} catch(SQLException e) {
			//return null;
			e.printStackTrace();
		}				
	}
	
	public static void DeleteDemo() {
		String sql = "Delete From freeboard Where num=?";		
		String url = "jdbc:oracle:thin:@192.168.0.3:1521:xe";
		String user = "ray3309";
		String dbpwd = "yhs8281";
		
		try(Connection conn = DriverManager.getConnection(url, user, dbpwd);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			Scanner sc = new Scanner(System.in)){
			
			System.out.println("삭제할 데이터 번호 : ");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));	// 삭제할 데이터의 번호
						
			int res = pstmt.executeUpdate();
			
			String msg = (res > 0) ? "삭제 성공" : "삭제 실패";
			System.out.println(msg);
						
		} catch(SQLException e) {
			e.printStackTrace();
		}		
	}
	
	
	public static void main(String[] args) {				
		// 업데이트 처리
		UpdateDemo();
		
		// 데이터 삭제 처리
		DeleteDemo();
	}
}
