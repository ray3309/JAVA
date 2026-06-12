package ex1;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;

public class Ex6_PrintWriter {
	static String path = "src/ex1/demo2.txt";
	public static void main(String[] args) {
		
		// 배운대로 혼자서 해보기
		// 힌트 문자열 => BufferedWriter > FileWriter
		// bw.write("내용")
		// bw.newLine()		
		try(Scanner sc = new Scanner(System.in);
				BufferedWriter bw = new BufferedWriter(new FileWriter(path));	
				BufferedReader br = new BufferedReader(new FileReader(path))) {						
			System.out.println("문자열 입력");
			
			bw.write(sc.nextLine());
			bw.newLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
