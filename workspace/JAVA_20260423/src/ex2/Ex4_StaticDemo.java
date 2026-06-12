package ex2;

public class Ex4_StaticDemo {

	// static 변수
	String msg = "Hello";
	static int num = 100;
	static String name = "테스형";
	static String path = "c:/aaa/test";
	
	// 아래의 메서드 에서 사용가능한 속성을 모드 출력
	public static void method1() {
		System.out.println(Ex4_StaticDemo.num);
		System.out.println(Ex4_StaticDemo.name);
		System.out.println(Ex4_StaticDemo.path);
		
	}
	
	public void method2() {
		System.out.println(Ex4_StaticDemo.num);
		System.out.println(Ex4_StaticDemo.name);
		System.out.println(Ex4_StaticDemo.path);
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		
		Ex4_StaticDemo ref = new Ex4_StaticDemo();
		ref.method2();		
		Ex4_StaticDemo.method1();
	}
	
}
