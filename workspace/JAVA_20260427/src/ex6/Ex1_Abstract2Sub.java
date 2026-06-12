package ex6;

public class Ex1_Abstract2Sub extends Ex1_Abstract2 {

	@Override
	public void myAbstract1()
	{
		System.out.println("Ex1_SubAbstract Override myAbstract1()");
	}

	@Override
	public void myAbstract1(int n)
	{
		System.out.println("Ex1_SubAbstract Override myAbstract1(int n) : " + n);
	}
	
	public static void main(String[] args) {						
		// 자식을 참조
		// 자식 클래스를 참조시 부모,자식 전부 사용 가능		
		// 추상 메서드는 부모는 미완성이기에 호출이 되면 자식이 실행 되는 개념
		@SuppressWarnings("unused")
		Ex1_Abstract2Sub ref1 = new Ex1_Abstract2Sub();
		
		// 부모를 참조
		// 부모 클래스를 참조시 부모만 참조 되고, 재정의한 자식 메서드가 우선
		// 호출시 자식이 실행 되는 개념
		@SuppressWarnings("unused")
		Ex1_Abstract2 ref2 = new Ex1_Abstract2Sub();
	}
}
