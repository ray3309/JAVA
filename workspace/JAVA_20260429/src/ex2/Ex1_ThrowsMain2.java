package ex2;
//본사의 Ex1_ThrowsExample.class를 받아와서 처리 
public class Ex1_ThrowsMain2 {
	
	private static void useClass(String string) throws ClassNotFoundException {//1java.lang.string{
		Ex1_ThrowsExample ref = new Ex1_ThrowsExample();
//		try {
//			ref.findClass(string);//2java.lang.string;	
//		} catch (Exception e) {
//			System.out.println("당신은 존재하지 않는 클래스를 사용했습니다.");
//		}
		ref.findClass(string);
		
	}
	public static void main(String[] args) throws ClassNotFoundException {
		useClass("java.lang.string");
	}

	
}
