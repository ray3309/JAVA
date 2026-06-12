package ex2;

//-- try-with-resource jdk7 ~ 
//close를 자동으로 닫아주는 기능 
//파일장치로 부터 내용을 읽어 내는 스트림등은 모두 AutoCloseable 구현했다.
//finally를 사용해서 close()호출할 필요가 없이 자동으로 close()호출해서
//자원을 자동으로 닫아 준다. -> 자동 자원관리!!!!!!
public class Ex2_AutoClose implements AutoCloseable {

	public Ex2_AutoClose() {
		System.out.println("생성자 호출!");
	}
	@Override
	public void close() throws Exception {
		System.out.println("자원 해제됨!");
	}
	public void print() {
		System.out.println("출력!");
	}

}


