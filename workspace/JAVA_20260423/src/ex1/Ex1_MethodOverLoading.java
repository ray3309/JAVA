package ex1;

// 메서드 오버로딩 : 동일 기능을 메서드를 따로 만들지 않고, 그룹인것 처럼 정의, 메서드명이 동일
// 매개변수의 갯수나 타입이 달라야 한다.
// 리턴 타입은 오버로딩 구분 안함!!!
public class Ex1_MethodOverLoading {
	void show()
	{
		System.out.println("기본 show "+String.valueOf(10));
	}
	
	void show(int num)
	{
		System.out.println("my show "+num);
	}
	
	void show(int age, String name)
	{
		System.out.println("you "+ name +" show " + age);
	}
	
	public static void main(String[] args) {
		
		Ex1_MethodOverLoading ref = new Ex1_MethodOverLoading();
		
		ref.show();
		ref.show(5);
		ref.show(43, "희상");
	}
}
