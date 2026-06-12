package ex2_other;

import ex2.Ex3_FinalSuper;

public class Ex3_FinalSub extends Ex3_FinalSuper {
	
	//@Override	재정의가 문법에 맞게 잘 되었는지를 검새해주는 어노테이션

	@Override
	public void method1() {
		System.out.println("Override Child Method");
	}
	
	public void childMethod() {
		System.out.println("오직 자식 메서드");
	}

	public static void main(String[] args) {
		//Ex3_FinalSub ref = new Ex3_FinalSub();
		//ref.method1();
		//ref.childMethod();
		
		// 부모를 참조 하더라도, 자식이 재정의한 메서드는 부모를 호출 하더라고
		// 무조건 재정의한 자식의 메서드가 우선권을 가져서 호출됨
		Ex3_FinalSuper ref2 = new Ex3_FinalSub();		
		ref2.method1();
	}

}
