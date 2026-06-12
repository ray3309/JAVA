package ex1;
//공통) 메서드를 만들 수 있는 규칙

//	void 메서드이름(자료형, 매게변수){
//  이부분에 실행코자 하는 프로그램 작성
//  }
//  JVM이라는 가상머신이 프로그램을 실행할대 main을 호출

public class Ex2_String {
	public static void main(String[] args) {
		System.out.println("맛보기!");
		test();
		System.out.println("실행끝");
	}

// 메서드 정의 할때는 다른 메서드 영역에서 정의하면 안됨
// 클래스 영역 안에서 정의 해야함
	public static void test() {
		// 메서드 영역!!
		System.out.println("테스트의 실행문");
	}
	
// 
	
	
	
	
	
}
