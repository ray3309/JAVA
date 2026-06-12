package service;

import java.util.List;

import dao.MyMemoDao;
import vo.MyMemoVO;
//Front로 부터 값을 받아서 Service는 dao 사용하는 객체고 = 비지니스 로직을 담당할 수 있다.
public class MyMemoService {

		public void addMemo(MyMemoVO vo) {
			MyMemoDao.getDao().addMemo(vo);
		}
		public List<MyMemoVO>  listMemo(){
			return MyMemoDao.getDao().listMemo();
		}
		public MyMemoVO detailMemo(int num) {
			return MyMemoDao.getDao().detailMemo(num);
		}
		public void updateMemo(MyMemoVO vo) {
			MyMemoDao.getDao().updateMemo(vo);
		}

		public void deleteMemo(int num) {
			MyMemoDao.getDao().deleteMemo(num);
		}
}
