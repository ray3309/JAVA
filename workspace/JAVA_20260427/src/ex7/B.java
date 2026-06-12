package ex7;

public class B extends A {
	private String typev;
	public B(String typev)	{
		super(typev);
		System.out.println(typev+"B 클래스 생성");
		this.typev = typev;
	}	
	@Override
	public void testA() {
		System.out.println("자식의 재정의 된"+typev+" B 메서드가 호출이 됨");
	}
	
	public void bMethod() {
		System.out.println("B의 메서드!!!!");
	}

}
