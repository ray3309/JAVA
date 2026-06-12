package ex2;
//본사 Ex1_ThrowsExample.class 만 제공한다.
//예외를 위임하기  - throws : 메서드의 호출하는 곳으로 위임을한다. 
//main에서는 JVM에게 위임!!!!!!
//예외를 발생시키기 - throw : throw new 예외클래스(메세지);
public class Ex1_ThrowsExample {

	public void findClass(String className) throws ClassNotFoundException{//3java.lang.string
		//try {
			System.out.println("해당 클래스는:"+Class.forName(className));//java.lang.string
		//} catch (ClassNotFoundException e) {
		//	System.out.println(e.getMessage());
		//	System.out.println("팡팡! 축하합니다. 오타에요");
		//	e.printStackTrace();
		//}
	}
}
