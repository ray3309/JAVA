package ex3;

// main의 목표
// 여기서 한번에 Light / SuperSonic / Stealth

public class AirPanMain {

	public static void main(String[] args) {
	
		LightAirCraft ref = new LightAirCraft();
		ref.takeOff();
		ref.fly();
		ref.land();
		ref.subMethod();
		System.out.println("--------------------");
		
		SuperSonic ref2 = new SuperSonic();
		ref2.takeOff();
		ref2.fly();
		ref2.land();
		System.out.println("--------------------");
		
		//setp2)
		Airplane ref3 = new LightAirCraft();		// UpCasting
		ref3.takeOff();
		ref3.fly();
		ref3.land();
		//ref3.subMthod();
		System.out.println("--------------------");
		
		Airplane ref4 = new SuperSonic();			// UpCasting
		ref4.takeOff();
		ref4.fly();
		ref4.land();
	}
}
