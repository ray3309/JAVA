package ex1;

public class C implements BCDInter{
	public C() {
		System.out.println("C생성자");
	}
	public void cMethod() {System.out.println("C서비스");}
	@Override
	public void bcdService() {
		System.out.println("C서비스");
	}
}
