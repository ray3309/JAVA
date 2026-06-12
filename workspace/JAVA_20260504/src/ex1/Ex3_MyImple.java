package ex1;
/*implements 구현할 인터페이스 */
public class Ex3_MyImple /*implements Ex3_MyInter*/{

//	@Override
//	public void printData1() {
//		// TODO Auto-generated method stub
//		
//	}
	//멤버영역에 익명 내부 클래스를 정의함. class Name{} (X)
	//재정의 해야할 상위 클래스,인터페이스를 익명으로 정의 할 수 있다. *****
	//내부클래스가 익명으로 Ex3_MyInter를 구현 
	//인터페이스or클래스자료형 변수 = new 익명(){ 정의  } => 익명내부클래스
	//2.멤버니까 이미 익명 내부클래스로 생성이 됨
	Ex3_MyInter ref = new Ex3_MyInter() {
		@Override
		public void printData1() {
			System.out.println("익명 내부클래스로 호출한 메서드1");
		}
	};
	//3.생성자 호출시 이미 생성및 정의된 익명 내부클래스의 참조변수 ref를 통해서
	//메서드를 호출 
	public Ex3_MyImple() {
		ref.printData1();
		ref.printDefault(); //인터페이스가 가지고 있는 기본 메서드
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex3_MyImple ref = new Ex3_MyImple();//1.생성자 호출
	}
}
