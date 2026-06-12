package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService;
import vo.MyMemoVO;

public class MyMemoDao {
	//싱글톤 
	private static MyMemoDao dao;
	private MyMemoDao() {}
	public static synchronized MyMemoDao getDao() {
		if(dao == null) {
			//싱글톤이니까 객체를 한번 생성해야 한다.
			return new MyMemoDao();
		}
		return dao;
	}
	//입력을 받는 메서드 :<insert id="add" parameterType="vo.MyMemoVO"> 
	//public void addMemo(MyMemoVO vo) { vo빼서 작업을 한다. }
	public void addMemo(MyMemoVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		//ss.insert(namespace.id, vo값);
		ss.insert("mymemo.add", vo);
		ss.close();
	}
	//전체출력 : <select id="list" resultType="vo.MyMemoVO">
	//from mymemo order by 1 desc => 여러줄의 데이터 => List<VO> 
	public List<MyMemoVO>  listMemo(){
		SqlSession ss = FactoryService.getFactory().openSession();
		//selectList : 다중row일때 while(rs.next()) => VO에 넣으면서 List에 추가해준다.,
		List<MyMemoVO> list = ss.selectList("mymemo.list");
		ss.close();
		return list;
	}
	//상세보기 :<select id="detail" resultType="vo.MyMemoVO" parameterType="int">
	// where num=#{num}  
	public MyMemoVO detailMemo(int num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		//해당 객체에만 담아서 반환 즉 하나의 row만 저장  
		MyMemoVO v = ss.selectOne("mymemo.detail", num);
		ss.close();
		return v;
	}
	//수정 :<update id="up" parameterType="vo.MyMemoVO">
	public void updateMemo(MyMemoVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.update("mymemo.up", vo);
		ss.close();
	}
	//삭제 : deleteMemo
	public void deleteMemo(int num) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.delete("mymemo.del", num);
		ss.close();
	}
}






