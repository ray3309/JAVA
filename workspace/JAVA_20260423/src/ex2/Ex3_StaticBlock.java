package ex2;

public class Ex3_StaticBlock {
	static int num;		//static 영역에 -> Ex3_StaticBlock
	int age;

	
	static void test() {
		System.out.println("static test메서드 호출! 2");
	}
	
	void test2() {
		System.out.println("인스턴스 메서드");
	}
	
	// static 블록 -> 초기화
	static {
		System.out.println("메인 보다 초기화에서 시작 1");
		test();

	}
	
	public Ex3_StaticBlock() {
		System.out.println("객체가 생성 될때 초기화 4");
		test2();
		test();
	}
	
	public static void main(String[] args) {
		System.out.println("메인 시작 3");
		@SuppressWarnings("unused")
		Ex3_StaticBlock ref = new Ex3_StaticBlock();
	}
}
