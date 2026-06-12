package ex1;

import java.util.Vector;

//제네릭 - Collection을 전용객체 만들자는 표시
//Collection<참조자료형> 변수; => Collection은 참조자료형만 저장할 수 있다.
public class Ex3_Vector {
	//String 전용
	private Vector<String> v;

	public Ex3_Vector() {
		//String 이 아니면 Vector 에 저장이 안된다.
		float ff = 11.0f;
		//String으로 변환 해줘야 된다.
		String fff = String.valueOf(ff);
		v = new Vector<>();
		v.add("Test");
		v.add(fff);
		v.add(String.valueOf('A'));
		v.add(String.valueOf(20.11));
		v.add(String.valueOf(true));
		v.add(String.valueOf(100L));
		System.out.println("사이즈 :"+v.size());
	}
	public void printVector() {
		for (String e : v) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Ex3_Vector ref = new Ex3_Vector();
		ref.printVector();
	}
}




