package ex2;

public class Ex1_BasicImple implements Ex1_BasicInter{

	@Override
	public void abMethod() {
		System.out.println("Interface 상수 :"+num);//인터페이스의 상수 호출
		//num=100;
		myDefault(); //인터페이스에 정의한 기본 메서드 호출
		Ex1_BasicInter.myStatic();//인터페이스에 정의한 static메서드 호출
	}
	
	@Override
	public void myDefault() {
		System.out.println("여기는 구현한 클래스에서 재정의함!");
	}
	
	public static void main(String[] args) {
		Ex1_BasicInter ref = new Ex1_BasicImple();
		ref.abMethod();
	}
}
