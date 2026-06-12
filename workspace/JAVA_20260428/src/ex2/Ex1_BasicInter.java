package ex2;
//인터페이스 구성 4가지 - 암기  *****
//기본 2가지 (상수,추상메서드)
//default, static 메서드 추가 
public interface Ex1_BasicInter {
  //public static final int NUM=10;
	int num=10; //상수 
	void abMethod(); //추상메서드 
	public default void myDefault() {
		System.out.println("인터페이스 전용 기본메서드");
	}
	public static void myStatic() {
		System.out.println("static 메서드");
	}
}
