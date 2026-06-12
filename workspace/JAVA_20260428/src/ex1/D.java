package ex1;

public class D implements BCDInter{
	public D() {
		System.out.println("D생성자");
	}
	public void dMethod() {System.out.println("D서비스");}
	@Override
	public void bcdService() {
		System.out.println("D서비스");
	}
}
