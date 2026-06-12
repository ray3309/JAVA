package ex1;

public class Ex2_LocalInnerStatic {
	private int num;
	public Ex2_LocalInnerStatic() {
		num = 100;
	}
	//static 메모리 구조에 존재
	//static은 각객체마다 공유 (불편)
	//생성 없이 사용가능 Ex2_LocalInnerStatic.Inner
	public static class Inner{
		int num3 = 300;
        static int num5 = 10;
        public Inner() {
        	System.out.println("Inner 객체가 생성됨");
		}
        public void innerMethod() {
            System.out.println("내부 클래스가 재정의한 메서드!");
        }
        public static void aa() {
            System.out.println("static 메서드네");
        }
        public void getData(Ex2_LocalInnerStatic outer) {
            System.out.println("외부클래스의 멤버 num -> " + outer.num);
            innerMethod();
        }
	}
	public static void main(String[] args) {
		//static 내부 클래스 생성방법
		Ex2_LocalInnerStatic ref = new Ex2_LocalInnerStatic();
		Ex2_LocalInnerStatic.Inner ref2 = new Ex2_LocalInnerStatic.Inner();
		ref2.getData(ref);
		//내부클래스 안에 static 메서드인 aa를 호출해보시오.
		//static자원을 내부클래스에 저장해놓고 사용할 때 가끔 사용하며
		//반드시 외부클래스에소속된 내부클래스의 자원으로 인식 
		Ex2_LocalInnerStatic.Inner.aa();
		
	}
	
}
