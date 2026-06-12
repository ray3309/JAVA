package exam3;

public class JetAirplane extends Airplane {
	
	public JetAirplane() {
		// TODO Auto-generated constructor stub
		super("제트기");
	}
	
	@Override
	public void fly()
	{
		System.out.println("높은 고도에서 빠른 속도(음속 내외)로 비행");
	}
	
	public static void main(String[] args) {
		JetAirplane ref = new JetAirplane();
		ref.takeOff();
		ref.fly();
		ref.land();		
	}
}
