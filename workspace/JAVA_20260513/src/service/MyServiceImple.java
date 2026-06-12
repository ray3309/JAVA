package service;

import java.util.List;
import java.util.Scanner;

import dao.MyDaoImple;
import dao.MyDaoInter;
import vo.MyDataVO;

//Front로 부터 사용자의 입력값을 받은 vo를 받아서 
//Dao로 전달하기 전에 비지니스 로직을 적용하기 위한 클래스 
public class MyServiceImple implements MyServiceInter {

	@Override
	public void addData(MyDataVO vo) {
		// 비지니스 로직을 적용
		// String ssn = "880811-1";
		String[] ssnArr = vo.getSsn().split("-");
		if (ssnArr[1].equals("1") || ssnArr[1].equals("3")) {
			// vo에 남자 성별을 저장
			vo.setGender("남자");
		} else {
			vo.setGender("여자");
		}
		// Dao로 전달하기 위해서 객체를 생성한다.
		MyDaoInter dao = new MyDaoImple();
		dao.save(vo);
	}

	// Dao의 findAll()메서드를 호출해서 완성하시오.
	@Override
	public List<MyDataVO> getListData() {
		MyDaoInter dao = new MyDaoImple();
		return dao.findAll();
	}

	public static void main(String[] args) {
		MyServiceImple ref = new MyServiceImple();

		MyDataVO v = new MyDataVO();

		try(Scanner sc = new Scanner(System.in)) {			
			Ext:while(true){
				System.out.println("메뉴를 입력 1.등록, 2.출력, 3=종료");			
				int selNum = Integer.parseInt(sc.nextLine());
				switch(selNum)
				{
				case 1:
				{
					v.setName("오나라");
					v.setEmail("kobilinux@naver.com");
					v.setAge(21);
				}break;
				
				case 2:
				{
					
				}break;
				
				case 3:
					System.out.println("종료 선택");
					break Ext;
				}
				
				
				ref.addData(v);
			}			
		} catch (Exception e) {
			// TODO: handle exception
		}

//	v.setName("오나라");
//	v.setEmail("kobilinux@naver.com");
//	v.setSsn("880708-2");
//	v.setAge(21);
//	ref.addData(v);
//	List<MyDataVO> mlist = ref.getListData();
//	for (MyDataVO e : mlist) {
//		System.out.println(e.getNum() +":"+e.getName());
//	}
	}
}
