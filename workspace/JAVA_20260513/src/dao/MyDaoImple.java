package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vo.MyDataVO;

//<]------ 인터페이스를 implements 키워드로 구현 
public class MyDaoImple implements MyDaoInter{

	private String url="jdbc:oracle:thin:@192.168.0.3:1521";
	private String user ="ray3309";
	private String dbpwd = "yhs8281";
	
	@Override
	public void save(MyDataVO vo) {
		
		System.out.println("Dao에서 실행된 gender:"+vo.getGender());
		
		//insert 문 처리하기 
		//insert into mydata values(mydata_seq.nextVal,name,email,ssn,age,sysdate);
		//vo로부터 받은 값을 SQL에 연결하기 
		String sql ="insert into mydata values(mydata_seq.nextVal,?,?,?,?,sysdate)";
		try (   
				Connection con = DriverManager.getConnection(url, user, dbpwd);
				PreparedStatement pstmt = con.prepareStatement(sql);
			){
				pstmt.setString(1, vo.getName());
				pstmt.setString(2, vo.getEmail());
				pstmt.setString(3, vo.getSsn());
				pstmt.setInt(4, vo.getAge());
				pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<MyDataVO> findAll() {
		List<MyDataVO> myList = new ArrayList<MyDataVO>();
		//최신 데이터 순으로 데이터 전체를 출력 함
		String sql = "select num,name,email,mdate from mydata order by 1 desc";
		try (
				Connection con = DriverManager.getConnection(url, user, dbpwd);
				PreparedStatement pstmt = con.prepareStatement(sql);
				){
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					//커서로 부터 받은 데이터를 VO에 저장하기
					MyDataVO v = new MyDataVO();
					v.setNum(rs.getInt("num"));
					v.setName(rs.getString("name"));
					v.setEmail(rs.getString("email"));
					v.setMdate(rs.getString("mdate"));
					//myList에 저장
					myList.add(v);
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return myList;
	}
//public static void main(String[] args) {
//	MyDaoImple ref = new MyDaoImple();
//	//입력 메서드 호출 하기 위해서 메서드의 매개변수와 동일하게 값을 전달 해야 한다. 
////	MyDataVO v = new MyDataVO();
////	v.setName("테스형");
////	v.setEmail("javabook@naver.com");
////	v.setSsn("880808-2");
////	v.setAge(30);
////	ref.save(v);
//	
//	List<MyDataVO> mlist = ref.findAll();
//	for (MyDataVO e : mlist) {
//		System.out.println(e.getNum() +":"+e.getName());
//	}
//}
}






