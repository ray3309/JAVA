package ex3;

public class SuperSonic extends Airplane{

	public SuperSonic() {
		// TODO Auto-generated constructor stub
		super("SuperSonicAirplane");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("초음속 비행 합니다.");
	}
	
//	public static void main(String[] args) {
//		SuperSonic ex = new SuperSonic();
//		ex.takeOff();	
//		ex.fly();
//		ex.land();
//	}
	
}
