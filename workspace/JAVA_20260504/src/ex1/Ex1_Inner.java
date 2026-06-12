package ex1;

import ex1.pp.Ex1_SuperOuter;

//내부 클래스 : 클래스안에 존재하는 또다른 클래스를 의미한다.(***)
//- 외부클래스는 내부클래스를 포함하는 클래스를 의미
//내부 클래스를 사용하는 이유는 외부클래스의 보조적인 역할 수행 
//<내부클래스의 종류>
//*멤버내부클래스 : 외부클래스의 멤버영역에 정의하는 클래스
//*로컬내부클래스 : 생성자,메서드 안에서 정의하는 클래스 
//*static내부클래스 : 내부클래스 안에서 static을 사용할 때 반드시 static내부클래스임
//*익명내부클래스 : clsss Name을 선언하지 않고 외부의클래스,인터페이스등을 내부
public class Ex1_Inner extends Ex1_SuperOuter{
	private int num;
	public Ex1_Inner() {
		num = 100;
	}
	@Override
	public void abMethodOuter() {
		// TODO Auto-generated method stub
		
	}
	public void myOuter() {
		System.out.println("외부 클래스의 메서드!");
	}
	public void work() {
		System.out.println("외부 클래스가 하는 업무!");
	}
	//멤버 내부 클래스를 정의 
	// Ex1_Inner.class ->외부클래스
	// Ex1_Inner$Inner.class -> 내부클래스 
	public class Inner extends Ex1_Inner{ //외부클래스의 보조적인 역할을 수행
		private int innerNum=10;
		public static void aa() {
			System.out.println("static메서드네");
		}
		public void myInner() {
			System.out.println("외부 클래스의 private :" + num);
			System.out.println("내부 클래스의 private :" + innerNum);
			myOuter(); // 외부 클래스의 메서드
		}
	}
	//핵심 포인트) 생성 방법과 그 주소를 통한 자원 접근 방법
	//내부클래스 개념(위)
	public static void main(String[] args) {
		// 외부 클래스를 생성 후 그 주소를 가지고 내부 클래스를 생성한다.
		Ex1_Inner ref = new Ex1_Inner();
		// [참조자료형] 변수 = new 생성자();
		// 외부클래스.내부클래스 변수 = ref.new 내부클래스()
		Ex1_Inner.Inner inner = ref.new Inner();
		inner.myInner();// 내부 클래스의 자원은 호출
		System.out.println("***************");
		ref.myOuter();//외부클래스의 자원은 호출
		
		// 한번에 내부클래스를 생성하고  myInner() 호출해보기 (권장)
		//내가 필요한 것이 내부클래스의 주소
		Ex1_Inner.Inner inner2 = new Ex1_Inner().new Inner();
		inner2.myInner();
		inner2.myInner();
		System.out.println("*******************");
		//일회용  - 참조하는 변수 없을 때 가비지 컬렉션이 메모리에서 해당 객체를 제거 
		new Ex1_Inner().new Inner().myInner();
		//static은? 클래스이름.메서드()
		//외부클래스.내부클래스.메서드()
		Ex1_Inner.Inner.aa();
	}
	
}






