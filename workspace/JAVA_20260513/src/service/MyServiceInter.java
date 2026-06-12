package service;

import java.util.List;

import vo.MyDataVO;

public interface MyServiceInter {
	public void addData(MyDataVO vo);
	public List<MyDataVO> getListData();
}
