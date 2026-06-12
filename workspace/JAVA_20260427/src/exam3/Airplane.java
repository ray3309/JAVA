package exam3;
//부모 클래스를 추상 클래스로 만들고
//MyAirplane이란 자식 클래스를 더 추가해서 잘 출력 되도록 구현

public abstract class Airplane {
	public Airplane(String airplanName) {
		System.out.println(airplanName + "비행기가 활주로에서 진입합니다.");
	}	
	
	public abstract void fly();	
	
	
	public final void takeOff() {
		System.out.println("이륙합니다.");
	}
	
	public final void land() {
		System.out.println("착륙합니다.");
	}
}
