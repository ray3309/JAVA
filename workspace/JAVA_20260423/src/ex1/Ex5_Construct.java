package ex1;
// 오버로딩(Overloading) : 메서드, 생성자 적용

public class Ex5_Construct {
	int num=0;
	String name="";
	
	public Ex5_Construct() {
		num = 100;
		name = "테스형";
		System.out.println("Default Construct");
	}
	
	public Ex5_Construct(int num)
	{
		// this 키워드를 사용해서 인스턴스 영역의 멤버들 참조 가능!!! 함수의 인자명과 멤버변수의 이름이 동일할 경우 사용
		this.num = num;
	}
	
	public Ex5_Construct(int num, String name)
	{
		this.num = num;
		this.name = name;
	}
	
	public String printConstruct() {
		return "번호:"+num+", 이름:"+name;
	}
	
	public static void main(String[] args) {		
		Ex5_Construct ref1 = new Ex5_Construct();
		System.out.println("-------------------------------------");
		
		Ex5_Construct ref2 = new Ex5_Construct(10);
		System.out.println("-------------------------------------");
		
		Ex5_Construct ref3 = new Ex5_Construct(50, "윤희상");
		System.out.println("-------------------------------------");
		
		System.out.println("생성자에 있는 값 출력");
		System.out.println(ref1.printConstruct());
		System.out.println(ref2.printConstruct());
		System.out.println(ref3.printConstruct());
	}
	
}
