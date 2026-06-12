package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;

// CallableStatement 오라클의 프로시저 호출하는 구문을 서버로 배달

//cl scr;
//create or replace procedure p_sawon
//( deptnonum in number, cur out SYS_REFCURSOR)
//IS
//BEGIN
//    open cur for
    
//    select * from sawon_px where deptno = deptnonum;
//END;

//3. ResultSet을 사용해서 SYS_REFCURSOR Return

public class Ex1_SawonProcedure {

	public static void main(String[] args) {
		

		String url = "jdbc:oracle:thin:@192.168.0.3:1521/XE";
		String user = "ray3309";
		String pwd = "yhs8281";
		String sql = "{ call p_sawon(?,?) }";
		
		try(Connection conn = DriverManager.getConnection(url, user, pwd);
			 CallableStatement cstmt = conn.prepareCall(sql);
				){
			
			// ?에 값을 바인딩 처리
			// in Mode
			cstmt.setInt(1, 10);
			
			// outMode로 값을 받기 위한 타입을 커서로 지정
			cstmt.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
			
			// 실행
			cstmt.execute();
			
			// outmode의 파라미터로 부터 ResultSet을 꺼낸다
			ResultSet rs = (ResultSet)cstmt.getObject(2);
			
			// cursor 반복하여 출력
			while(rs.next()) {
				int sabun = rs.getInt("sabun");
				String saname = rs.getString("saname");
				int deptno = rs.getInt("deptno");
				System.out.println(sabun+" : " + saname + " : " + deptno);
			}
			
			System.out.println(conn);;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
