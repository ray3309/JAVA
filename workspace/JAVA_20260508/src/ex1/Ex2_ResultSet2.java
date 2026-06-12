package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//select 일대 오라클의 결과(ResultSet)를 받아주는 자바

public class Ex2_ResultSet2 {
	
	private String url = "jdbc:oracle:thin:@192.168.0.3:1521:xe";
	private String user = "";
	private String pwd = "";
	public String sql = "";
	
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	
	static {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Ex2_ResultSet2() {
		setUser("ray3309");
		setPwd("yhs8281");
		setSql("select num,title,writer,conts,hit,fredate from freeboard order by 1 desc");
	}

	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public ArrayList<FreeBoardVO> freeBoardList() {
		ArrayList<FreeBoardVO> arr = new ArrayList<FreeBoardVO>();
		
		try(Connection conn = DriverManager.getConnection(getUrl(), getUser(), getPwd());
				PreparedStatement pstmt = conn.prepareStatement(getSql());){	
						
				// 검색 쿼리의 결과를 ResultSet으로 반환
				ResultSet rs = pstmt.executeQuery();			
				while(rs.next()) {				
					FreeBoardVO v = new FreeBoardVO();
					v.setNum(rs.getInt("num"));
					v.setTitle(rs.getString("title"));
					v.setWriter(rs.getString("writer"));
					v.setConts(rs.getString("conts"));					
					v.setHit(rs.getInt("hit"));
					v.setDate(rs.getString("fredate"));
					arr.add(v);					
				}
				return arr;
			} catch (SQLException e) {
				e.printStackTrace();
				return arr;
			}
	}
	
	public FreeBoardVO freeBoardDetail(int nNum) {
		
		setSql("select num,title,writer,conts,hit,fredate from freeboard where Num = ?");
		
		try(Connection conn = DriverManager.getConnection(getUrl(), getUser(), getPwd());
			PreparedStatement pstmt = conn.prepareStatement(getSql());){
			
			pstmt.setInt(1, nNum);
			
			ResultSet rs = pstmt.executeQuery();
			
			// Num이 PK이므로 데이터를 반복 할 필요 없음
			FreeBoardVO v = new FreeBoardVO();			
			if(rs.next()) {
				v.setNum(rs.getInt("num"));
				v.setTitle(rs.getString("title"));
				v.setWriter(rs.getString("writer"));
				v.setConts(rs.getString("conts"));
				v.setHit(rs.getInt("hit"));
				v.setDate(rs.getString("fredate"));
			}
			return v;
		} catch(Exception e) {
			return null;
		}		
	}
	
	public static void main(String[] args) {	
		Ex2_ResultSet2 ref = new Ex2_ResultSet2();		
	
//		ArrayList<FreeBoardVO> arr2 = ref.freeBoardList();
//		for (FreeBoardVO f : arr2) {			
//			System.out.println(f.getNum() + "번의 데이터 " + ", title : " + f.getTitle() + ", Writer : " +
//					 f.getWriter() + ", Conts : " + f.getConts() + ", hit = " + f.getHit() + ", Date : " + f.getDate());
//		}	
		
		FreeBoardVO v = ref.freeBoardDetail(63);
		System.out.println(v.getNum() + "번의 데이터 " + ", title : " + v.getTitle() + ", Writer : " +
		 v.getWriter() + ", Conts : " + v.getConts() + ", hit = " + v.getHit() + ", Date : " + v.getDate());

	}
}
