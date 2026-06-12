package ex1;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.myMemoVO;

public class MyMemoTest {

	public static void main(String[] args) {
		SqlSession ss = MyBatisUtil.getFactory().openSession();
		
		
		
		myMemoVO v = new myMemoVO();
		v.setMemo("집에가자");
		v.setWriter("희상");
		
		ss.insert("mymemo.add", v);
		
		ss.commit();
		ss.close();		
		
		SqlSession ss1 = MyBatisUtil.getFactory().openSession();
		List<myMemoVO> list = ss1.selectList("mymemo.list");
		
		for (myMemoVO e : list) {
			System.out.println(e.getNum());
			System.out.println(e.getMemo());
			System.out.println(e.getWriter());
		}
		
		ss1.commit();
		ss1.close();		
		
	}
}
