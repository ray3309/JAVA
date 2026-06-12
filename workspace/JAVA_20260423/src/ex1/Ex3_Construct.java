package ex1;
// 생성자 오버라이딩 가능!!
// 없으면 기본생성자를 컴파일러가 생성
public class Ex3_Construct {

	Ex3_Construct() {
		System.out.println("Default Construct Object Create On Heap");
	}
	
	public void test1()
	{
		System.out.println("테스트1 메서드 호출");
	}
	
	public static void main(String[] args)
	{
		Ex3_Construct ref = new Ex3_Construct();
		ref.test1();
		ref.test1();
	}
	
	
}
