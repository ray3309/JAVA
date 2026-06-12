package ex1;

//컴파일 예외 : 컴파일러에 의해서 체크되는 예외
//- ClassNotFoundException : 해당 클래스를 로딩하지 못하면 예외가 발생한다.
//- InterruptedException : 스레드 실행중에 인터럽트가 발생할 예외 
public class Ex1_Exception {
public static void main(String[] args) {
	//? 와일드 카드 , 모든 클래스 타입을 의미 
	try {
		Class<?> msg = Class.forName("ex1.Ex1_Exception");
		System.out.println("Message =>"+msg);
	} catch (ClassNotFoundException e) {
		
		//e.printStackTrace();
		System.out.println("해당 클래스는 존재하지 않습니다.");
	}
	System.out.println("프로그램 실행!");
	System.out.println("=======");
	for(int i=0; i<10; i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
	}
	System.out.println("=======");
}
}
