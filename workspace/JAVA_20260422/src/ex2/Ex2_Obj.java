package ex2;

// 클래스 Declare
// Configure : Attribute, Method
// Access : public > protected > default > private
// default는 표시를 생략

public class Ex2_Obj {
	// 멤버필드 - Attribute (Instance)
	// 접근제한자 자료형 변수형
	 int num1 = 100;	// 접근제한자 입력 안할경우 default 로 컴파일 시점에 붙음
	
	public static void main(String[] args) {
		
		Ex2_Obj ref = new Ex2_Obj();
		System.out.println(ref.num1 == 100);
	}
}
