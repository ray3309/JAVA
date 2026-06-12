package ex4;
//InterA,InterB를 구현한 클래스 
public class ABImple implements InterA,InterB{
	@Override
	public void testB() {
		System.out.println("B");
	}
	@Override
	public void testA() {
		System.out.println("A");
	}
	public static void main(String[] args) {
		//상위주소를 잡고 생성 해도 만약 다형성으로 적용하려면 ??
		InterA ref1 = new ABImple();
		InterB ref2 = new ABImple();
		ref1.testA();
		ref2.testB();
	}
}
