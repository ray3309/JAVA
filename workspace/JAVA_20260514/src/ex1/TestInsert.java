package ex1;

import org.apache.ibatis.session.SqlSession;

import vo.MyDataVO;

public class TestInsert {
	public static void main(String[] args) {
		SqlSession ss = MyBatisUtil.getFactory().openSession(true);
		
//		<insert id="addData" parameterType="vo.MyDataVO">
		
		//입력값을 VO에 저장
		MyDataVO v = new MyDataVO();
		v.setName("이슬이");;
		v.setAge(10);
		v.setGender("여자");
		v.setSsn("210606-4");
		v.setEmail("test@test.com");
		
		int res = ss.insert("mydata.addData", v);
		System.out.println(res);
		ss.close();
	}
}
