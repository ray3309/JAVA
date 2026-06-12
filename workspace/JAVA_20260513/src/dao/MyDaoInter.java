package dao;

import java.util.List;

import vo.MyDataVO;

//인터페이스 구성 : 상수 , 추상 , 기본 , static 
public interface MyDaoInter {
	public void save(MyDataVO vo); //VO를 사용해서 데이터베이스 저장할 메뉴
	public List<MyDataVO> findAll();//데이터베이의 데이터를 VO에 하나씩 담아서 List에 저장후 반환
}
