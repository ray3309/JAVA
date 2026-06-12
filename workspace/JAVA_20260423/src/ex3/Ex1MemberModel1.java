package ex3;

// 기능 : 회원
public class Ex1MemberModel1 {	
	
	private Member member; 
	
	// 추론. 
	// ID, 나이, 이름 등을 저장한 객체의 주소를 매게변수로 받는다.	
	public void addMember(Member member) {
		// logic (나이를 받아와서 성년/미성년 구분 후 Member etc(성년/미성년) 등록하는 메서드
		int age = member.getAge();
		if(age > 19) {
			member.setEtc("성년");
		}else {
			member.setEtc("미성년");
		}
		this.member = member;
	}
	
	public void printMember() {
		System.out.println("id : " + member.getId() );
		System.out.println("name : " + member.getName() );
		System.out.println("age : " + member.getAge() );
		System.out.println("Sep : " + member.getEtc() );
	}	
}
