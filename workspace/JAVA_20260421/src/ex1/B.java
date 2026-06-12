package ex1;
//인터페이스를 사용 하위클래스가 인터페이스를 구현한다 용어를 사용한다.
//키워드 implements 인터페이스 이렇 구현을 하면
//하위 클래스는 인터페이스가 가진 모든 추상메서드를 반드시 재정의 해야 한다.
public class B implements BCDInter{
	public B() {
		System.out.println("B생성자호출");
	}
	public void bMethod() {System.out.println("B서비스");}
	@Override
	public void bcdService() {
		System.out.println("B서비스");
	}
}
