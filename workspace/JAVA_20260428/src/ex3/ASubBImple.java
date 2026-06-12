package ex3;
//하나의 클래스는 인터페이스 다중 구현이 가능하다. *****
//추상클래스인 ASuper상속받으면서 AInter,BInter를 모두 구현하는 클래스
//이런 구조를 이해!!!!!!
//문법이 extends A implememts InterA,InterB {
public class ASubBImple extends ASuper implements AInter,BInter{

	@Override
	public void aTest() {
		System.out.println("ASuper 추상메서드를 재정의 한 메서드!");
	}

	@Override
	public void aMethod() {
		System.out.println("AInter의 추상메서드를 재정의 한 메서드!");
	}

	@Override
	public void bMethod() {
		System.out.println("BInter의 추상메서드를 재정의 한 메서드!");
	}
	public static void main(String[] args) {
		ASuper ref = new ASubBImple();
		ref.aTest();
		//ref.aMethod();
		ASubBImple ref2 = new ASubBImple();
		ref2.aMethod();
		ref2.aTest();
		ref2.bMethod();
	}
}

