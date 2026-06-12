package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * CREATE TABLE freeboard (
num	NUMBER(10) CONSTRAINT freeboard_num_pk PRIMARY KEY,
title VARCHAR2(50) NOT NULL,
writer VARCHAR(50) NOT NULL,
conts VARCHAR2(400),
pwd VARCHAR2(10) NOT NULL,
hit NUMBER(10) DEFAULT 0 NOT NULL,
fredate DATE DEFAULT SYSDATE NOT NULL
);
 * */

// oracle 에서 statement 는 바로 사용하면 안됨(각각의 데이터를 파싱 처리로 인해서 속도 다운, 해킹 문제 있음) 
public class Ex2_Statement {
	public static void main(String[] args) {
		
		// Connection 인터페이스의 객체 변수 선언
		Connection conn = null;
		
		// DB Url 변수
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "mytess2";
		String pwd = "mytess2";
		
		// SQL 문자 객체 변수
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
			
			String sTitle = "테스형 반가워요";
			String sWriter = "테스형";
			String sConts = "테스형 반가워요2";
			String sPwd = "5454";
			
			// JDBC 드라이버를 메모리에 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			
			// 접속한 DB 정보로 Connection 객체 생성
			// 2티어와 3티어의 차이 Connection 관리(중간 미들웨어)
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println(conn);		
			
			// Statement 객체 생성
			stmt = conn.createStatement();
			
			// freeboard 테이블에 데이터 삽입
			StringBuilder sb = new StringBuilder();
			sb.append("INSERT INTO freeboard VALUES (freeboard_seq.nextVal, '").
			append(sTitle).append("', '").append(sWriter).append("', '").
			append(sConts).append("', '").append(sPwd).append("',0,sysdate)");
			System.out.println("Insert:"+sb);
			
			// sql 문자 실행 및 반환값 저장
			int res = stmt.executeUpdate(sb.toString());			
			String Msg = (res > 0) ? "입력 성공!!!" : "입력 실패!!!";			
			System.out.println(Msg);
			
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
