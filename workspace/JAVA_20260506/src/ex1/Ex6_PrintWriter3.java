package ex1;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Ex6_PrintWriter3 {
	static String path = "src/ex1/demo4.txt";
	
	public static void main(String[] args) {
		
		// PrintWriter -> 바이트, 문자 스트림 모두 지원해줌
		// BufferedWriter, OutputStreamWriter 내장 되어있음
		// PrintWriter(stream, true) : autoflush
		// 문자스트림에서 브릿지가 Buffer 내장에서 바로 바이트스트림으로 연결 가능
		
		try(PrintWriter pw = new PrintWriter(new FileOutputStream(path))) {
			pw.println("하이");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
}
