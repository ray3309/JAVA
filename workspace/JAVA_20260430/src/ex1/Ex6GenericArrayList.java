package ex1;

import java.util.ArrayList;

//UI는 콘솔이 될 수도 있고 ,GUI가 될수도 있다.
//이클래스는 둘다 사용가능하도록 클래스를 정의 -> 객체지향 가장 기초 
public class Ex6GenericArrayList {
	
	private ArrayList<MemberVO> memList;
	
	public Ex6GenericArrayList() {
		memList = new ArrayList<>();
	}
	//입력 , 출력 
	public void addMember(MemberVO vo) {
		if(vo.getAge() > 19) {
			vo.setEtc("성년");
		}else {
			vo.setEtc("미성년");
		}
		memList.add(vo);
	}
	public ArrayList<MemberVO> getMemList(){
		return memList;
	}
	public int getTotal() {
		return memList.size();
	}
}




