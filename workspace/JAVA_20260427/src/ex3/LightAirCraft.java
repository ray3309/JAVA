package ex3;

public class LightAirCraft extends Airplane{

	public LightAirCraft() {
		// TODO Auto-generated constructor stub
		super("LightAirCraft");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("저공/저속비행");
	}
	
	public void subMethod()
	{
		System.out.println("자식의 메서드 호출");
	}
	
//	public static void main(String[] args) {
//		LightAirCraft ex = new LightAirCraft();
//		ex.takeOff();	
//		ex.fly();
//		ex.land();
//	}
	
}
