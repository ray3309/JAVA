package ex1;

public interface Ex3_MyInter {
	int data = 100; //상수
	void printData1(); // 추상메서드 
	public default void printDefault() {
		System.out.println("디폴트 메서드");
	}
}
