package ex1;
//추상클래스 정의 해서 익명내부클래스로 적용 
public abstract class Ex5_Person {
	int num = 10;
	public Ex5_Person() {
		System.out.println("Ex2_Person => 생성자");
	}
	public abstract void wake();
}
