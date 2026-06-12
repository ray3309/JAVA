package ex2;
// static 으로 선언된 함수는 생성없이 클래스명.메소드 혹은 클래스명.변수명 으로 사용 가능
public class Ex1_StaticBasic {
	int num1 = 100;
	static int num2 = 200;	// 생성없이 참조 가능한 변수(정적(Static) 변수)
	public static void testMethod()
	{
		System.out.println(num2+"는 static 자원을 사용한다.");
	}
}
