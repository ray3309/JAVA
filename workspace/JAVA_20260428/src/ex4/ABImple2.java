package ex4;
//InterC만을 구현 하면 해결 
public class ABImple2 implements InterC{

	@Override
	public void testA() {
		System.out.println("A");
	}

	@Override
	public void testB() {
		System.out.println("B");
	}
	public static void main(String[] args) {
		//상위주소를 잡고 생성 - 다형성을 할 수 있는 자료형으로 변경!
		InterC ref = new ABImple2();
		ref.testA();
		ref.testB();
	}
}
