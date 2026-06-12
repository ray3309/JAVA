package ex3;

// 한번에 Light, SuperSonic, Stealth 를 생성하고 싶다.

public class AirPlanMain2 {
	
	public static void main(String[] args) {
		//반복문 사용
		//Airplane[] apArr = new Airplane[3];
		Airplane[] apArr = {new LightAirCraft(), new SuperSonic(), new StealthAircraft()};
		
		for (Airplane airplane : apArr) {
			airplane.takeOff();
			airplane.fly();
			airplane.land();
			System.out.println("-------------");
		}		
	}

}
