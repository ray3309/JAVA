package ex6;

public abstract class Ex1_Abstract {

	//Member
	@SuppressWarnings("unused")
	private int n;
	
	//const
	public Ex1_Abstract() {
		System.out.println("추상 클래스의 생성자 호출");
	}
	
	public void ex1_method() {
		System.out.println("메서드 호출!");
	}
	
	public static void main(String[] args) {
		//Ex1_Abstract ref = new Ex1_Abstract();
		//ref.ex1_method();
	}
}
