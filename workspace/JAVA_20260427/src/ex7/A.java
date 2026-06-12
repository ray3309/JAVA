package ex7;

public class A {
	public A(String typev) {
		System.out.println(typev + "의 A클래스 생성");
	}

	public void testA() {
		System.out.println("부모의 메서드 호출!");
	}

	public final void aMethod() {
		System.out.println("A메서드");
	}
}
