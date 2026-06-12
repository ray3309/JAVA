package ex1;

import ex1.pp.Ex1_SuperInner;

//로컬 내부클래스
public class Ex2_LocalInner {
	//멤버변수
	private int num;
	public Ex2_LocalInner() {
		num = 100;
	}
	public void insertTest(int num) { // 메서드 시작
		@SuppressWarnings("unused")
		int num2 = 10; //메서드안에 선언한 지역변수
		num2 = 200; //변수니까 값을 변경 할 수 있다.
		final int cnum = 1000; //상수니까 값은 변경이 안된다.
		num=100;
		//메서드 안에 클래스를 선언 - 로컬 내부클래스 
		class Inner extends Ex1_SuperInner{
			@SuppressWarnings("unused")
			int num3 = 300; // 내부클래스안에 선언한 변수
			@SuppressWarnings("unused")
			static int num5=10;
			public Inner() {
				System.out.println("Inner 객체가 생성됨");
			}
			@Override
			public void innerMethod() {
				System.out.println("내부 클래스가 재정의한 메서드!");
			}
			@SuppressWarnings("unused")
			public static void aa() {
				System.out.println("static메서드네");
			}
			public void getData() {
				//외부클래스의 메서드안에 선언한 지역변수 num를 
				//내부클래스가 참조하는 순간 외부의 지역변수는 상수로 변경이 된다.
				//System.out.println("상수 num:"+num);
				//멤버필드 num를 내부클래스에 참조하고 싶다면? 
				//내부클래스에서 외부클래스의 자원을 참조 -> Ex2_LocalInner.this
				System.out.println(Ex2_LocalInner.this.num);
				System.out.println("상수값 cnum 사용 :"+cnum);
				innerMethod(); // 재정의한 메서드 
			}
		}// 내부 클래스 종료
		// 로컬내부클래스는 메서드가 호출이 끝나면 함께 사라진다. *****
		new Inner().getData();
	} //메서드 종료
}








