package ex1;

// 변수 : 자바에서 변수를 저장할 때 문법
// 자료형 변수이름(소문자); 선언
// Variable Name = Value( Declare Variable Type Same); => Initialize
// Variable Location : Member Section, Local Section *****
public class Ex3_Var01 {
	public static int num = 100;

	public static void main(String[] args) {
		// local Variable is Must One Declare!!! ( Not Use Same Variable )
		int num;	// Local Variable
		// Declare Variable Assign Value Operator
		num = 100;
		System.out.println(num); // Variable Value Output Screen
		test();
	}

	public static void test() {
		int num;	// Local Variable
		num = 127;
		System.out.println(num);
	}

}
