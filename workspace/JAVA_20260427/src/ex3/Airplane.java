package ex3;
// Parent Class
public class Airplane {
	public Airplane(String airplanName) {
		System.out.println(airplanName + "비행기가 활주로에서 진입합니다.");
	}
	
	public void fly() {
		System.out.println("일반적인 비행");
	}
	
	public final void takeOff() {
		System.out.println("이륙합니다.");
	}
	
	public final void land() {
		System.out.println("착륙합니다.");
	}
}
