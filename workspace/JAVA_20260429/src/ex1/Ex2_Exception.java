package ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//컴파일 예외
//파일을 읽어 들이기 위한 클래스를 사용했을 때 파일 없으면 어떻게 오류가 나고
//이런 자원관련 클래스는 반드시 close() 처리를 해야 한다. 
//finally 문법에 대해서 알아보자.
//파일이 존재하냐
//장치에 문제가 있냐 등등 
//if else if else if else 처럼 다중 catch를 처리 ......
public class Ex2_Exception {
	public static void main(String[] args) {
		String path = "D:\\ictstudy\\java\\workspace\\java0429\\src\\ex1\\msg2.txt";
		// msg.txt의 내용을 읽어 들이고 싶다. => FileInputStream 사용
		// Scanner sc = new Scanner();
		FileInputStream fis=null;//finally에서 참조해서 close() 해야 하기 때문이다.
		try {
			//try문 안에서만 사용이 가능한 지역변수
			//FileInputStream fis = new FileInputStream(path);
			fis = new FileInputStream(path);
			System.out.println("파일 객체가 생성이 되어 파일 장치에 연결되었습니다.");
			// 가설 : 파일을 읽지 못한 경우 -> 오류 발생하면
			// fis.read():연결된 입력에서 한 글자를 바이트단위로 읽어 들이는 메서드
			// nextLine()처럼 장치로 부터 읽어들이는 메서드
			System.out.println((char) fis.read());
			System.out.println("파일을 읽었습니다.");
			
			// fis.close(); 처리하면 안된다. finally 에서 해야 함!
			// fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 찾지 못했습니다.");
		} catch (IOException e) {
			System.out.println("장치에 문제가 발생해서 파일 읽기를 실패!!!!!");
		} catch (Exception e) {// 나머지 : 부모니까
			System.out.println("예외가 발생함");
		} finally { //예외가 발생하던 안하던 무조건 실행되는 영역이다.자원 해제등을 사용
			System.out.println("무조건 실행 되는 영역 , 예외와 관련 없이");
			try {
				if(fis != null) { //null아닐때 위의 FileInputStream 정상적으로 생성(파일과 연결) 되었을 때만 실행
				fis.close();
				}
				System.out.println("파일 장치에 연결을 무조건 해제 되었습니다.");
			} catch (IOException e) {
				System.out.println("파일 닫기 실패!!!!");
			}
		}

	}
}
