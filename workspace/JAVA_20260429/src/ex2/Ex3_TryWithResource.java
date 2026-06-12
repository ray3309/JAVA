package ex2;

import java.io.FileInputStream;

//ex1.Ex2 소스를 try-with-resource문으로 변경 해보 예정(점심 시간 이후)
public class Ex3_TryWithResource {
public static void main(String[] args) {
	String path = "D:\\ictstudy\\java\\workspace\\java0429\\src\\ex1\\msg.txt";
	//파일장치로 부터 내용을 읽어 내는 스트림 
	// finally를 사용해서 close()호출할 필요가 없이 자동으로 close()호출해서
	// 자원을 자동으로 호출해준다. -> 자동 자원관리!!!!!!
	try (FileInputStream fis = new FileInputStream(path)){
		System.out.println((char) fis.read());
	} catch (Exception e) {
		System.out.println("파일을 읽는데 문제가 발생!");
	}
}
}
