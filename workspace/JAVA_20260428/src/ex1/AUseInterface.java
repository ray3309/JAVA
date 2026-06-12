package ex1;

public class AUseInterface {
	//접점인 B,C,D의 상위 인터페이스 주소만 가진다.
	private BCDInter bcd;
//	private B b;
//	private C c;
//	private D d;
	public AUseInterface(int n) {
		if(n == 1) {
			bcd = new B();
		}else if(n == 2) {
			bcd = new C();
		}else if(n == 3) {
			bcd = new D();
		}
		System.out.println("A생성자 호출");
	}
	//생성자가 초기화 되고 난 이후 다형성에 의해서 해당 객체의 
	//메서드가 호출이된다.
	//예)1 -> B()주소니까 소속된 메서드가 실행 
	public void executService() {
		bcd.bcdService();
	}
	public static void main(String[] args) {
		AUseInterface ref = new AUseInterface(2);
		ref.executService();
	}
}
