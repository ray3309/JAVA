package ex2;

import java.io.File;
import java.util.Arrays;

public class Ex2_File {
	@SuppressWarnings("unused")
	private static void examStringList(String path) {
		//File 객체의 생성자에 값이 디렉토리 일경우도 생성 
		File f = new File(path);
		//생성한 파일 객체가 디렉토리이면 true
		System.out.println(f.isDirectory());
		//path가 존재하면 true
		if(f.exists()) {
			//디렉토리 일경우 그안에 목록을 모두 문자열 배열로 반환
			String[] flist = f.list();
			//Arrays 클래스 -> 배열을 문자열로 출력
			System.out.println(Arrays.toString(flist));
			System.out.println("----------------------");
			for(String e : flist) {
				System.out.println(" "+e);
			}
		}
		
	}
	private static void examFileList(String path) {
		//File 객체의 생성자에 값이 디렉토리 일경우도 생성 
		File f = new File(path);
		//생성한 파일 객체가 디렉토리이면 true
		System.out.println(f.isDirectory());
		//path가 존재하면 true
		if(f.exists()) {
			//디렉토리 일경우 그안에 목록을 모두 문자열 배열로 반환
			//String[] flist = f.list();
			// ex2안에 파일과 디렉토리 하나하나를 File객체생성해서 File[] 각각 담아서 반환
			File[] flist = f.listFiles();
			//Arrays 클래스 -> 배열을 문자열로 출력
			System.out.println(Arrays.toString(flist));
			System.out.println("----------------------");
			for(File e : flist) {
				if (e.isDirectory()) {
					System.out.println("Directory=>"+e.getName());
				} else {
					System.out.println("File=>"+e.getName());
				}
				//if else문을 사용해서 파일인지, 디렉토리인지를 구별할 수 있다.	
			}
		}
		
	}
	public static void main(String[] args) {
		String path = "src/ex2";
		//examStringList(path);
		examFileList(path);
	}

}
