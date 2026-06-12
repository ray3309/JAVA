package ex1;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.MyDataVO;

public class Test {
	public static void main(String[] args) {
		SqlSession ss = MyBatisUtil.getFactory().openSession(true);

//		ss.selectList(mapper의 이름);
		List<MyDataVO> mlist = ss.selectList("mydata.list");
		for (MyDataVO e : mlist) {
			System.out.println("번호:"+e.getNum());
			System.out.println("이름:"+e.getName());
			System.out.println("==========================");
		}
	}
}
