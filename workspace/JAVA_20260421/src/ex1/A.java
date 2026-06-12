package ex1;
//has a 관계 : B클래스를 접근하기 위한 주소를 멤버필드에 선언한다.
//A()생성자에서 b를 생성해서 멤버필드에 저장한다.
public class A {
	//멤버필드에 각 서비스 객체를 선언
	private B b;
	private C c;
	private D d;
	//생성자에서 사용자가 입력하는 변수 n을 기준으로'
	//멤버필드를 조건에 따라서 초기화 
	public A(int n) {
		if(n == 1) {
			b = new B();
			//b.bMethod();
		}else if(n == 2) {
			c = new C();
			//c.cMethod();
		}else if(n == 3) {
			d = new D();
			//d.dMethod();
		}
		System.out.println("A 생성자 호출!");
	}
	public void execService(int n) {
		if(n == 1) {
			//b = new B();
			b.bMethod();
		}else if(n == 2) {
			//c = new C();
			c.cMethod();
		}else if(n == 3) {
			//d = new D();
			d.dMethod();
		}
	}
public static void main(String[] args) {
	int requestNum = 2;
	A ref = new A(requestNum);
	ref.execService(requestNum);
}
}




