package ex2_other;

import ex2.Ex2_SuperA;

public class Ex2_SubA extends Ex2_SuperA {

	private int myNum;
	
	public Ex2_SubA() {
		// super(); -> this();
		myNum = 50000;
		System.out.println("자식 생성자 호출");
	}
	
	public void printB() {
		System.out.println(myNum);
		System.out.println("부모 자원=================");
		System.out.println("Num1 => " + getNum1());
		//System.out.println(num2);
		System.out.println(name);		
	}
	
	public static void main(String[] args) {
		Ex2_SubA ref = new Ex2_SubA();
		ref.printB();
	}
}
