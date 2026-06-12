package ex2;

import javax.management.RuntimeErrorException;

//문법)
//try(AutoCloseable 구현한 클래스를 생성한다.) { => close() 자동으로 호출해준다. ******
//
//} catch (Exception e) {
//
//} 
@SuppressWarnings("unused")
public class Ex2_AutoCloseMain {
public static void main(String[] args) {
	try (
			Ex2_AutoClose ref = new Ex2_AutoClose();
		){
		ref.print();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
