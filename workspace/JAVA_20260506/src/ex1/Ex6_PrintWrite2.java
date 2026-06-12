package ex1;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex6_PrintWrite2 {

	static String path = "src/ex1/demo3.txt";
	
	public static void main(String[] args) {
		try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)));) {
			bw.write("테스트2");
			bw.newLine();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
	}
}
