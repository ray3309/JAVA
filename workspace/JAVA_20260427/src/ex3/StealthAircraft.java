package ex3;

public class StealthAircraft extends Airplane {
	
	public StealthAircraft(){
		super("StealthAircraft");
	}
	
	@Override
	public void fly(){
		System.out.println("스탤스 비행 합니다.");
	}
	
//	public static void main(String[] args) {
//		StealthAircraft ref = new StealthAircraft();
//		ref.takeOff();
//		ref.fly();
//		ref.land();
//	}
	
}
