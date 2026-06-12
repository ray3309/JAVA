package ex7;

public class E extends C {
	private String typev;
	public E(String typev) {
		super(typev);
		System.out.println(typev+"E 클래스 생성");
		this.typev = typev;
	}
	@Override
	public void testA() {
		System.out.println("자식의 재정의 된"+typev+" E 메서드가 호출이 됨");
	}
	
	public void eMethod(){
		System.out.println("순수한 E클래스의 메서드");
	}

}
