package ex2;

public class Ex2_SuperA {
	private int num1;
	
	protected String name;
	
	int num2;
	
	public Ex2_SuperA() {
		num1 = 10000;
		num2 = 20000;
		name = "ICTPassword 신촌 1";
		System.out.println("Log: 부모 클래스 생성");
	}
	
	public void printA() {
		System.out.println(name + "부모의 메서드 호출!");
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}
}
