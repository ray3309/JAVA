package ex3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//try-with-resource 로 변경하기 
@SuppressWarnings("unused")
public class Ex1_FileInputStremExam {
	public static void main(String[] args) {
		// 원본 경로
		String path = "D:\\ictstudy\\jdk\\openjdk.zip";
		// 복사될 경로
		String path2 = "D:\\ictstudy\\target\\myjdk4.zip";
		// 2차 스트림이면서 기능을 가진 스트림
		// 반드시 1차를 통해서 사용된다.
		//BufferedInputStream bis = new BufferedInputStream(path);
		File f = new File(path);
		System.out.println(f.exists());
		//FileInputStream fis=null;
		//FileOutputStream fos=null;
		//BufferedInputStream bis = null;
		//BufferedOutputStream bos = null;
		//try(참조자료형 변수 =new 생성자호출())
		try(    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path2));
				){
			//fis = new FileInputStream(path);
			//fos = new FileOutputStream(path2);
			//bis = new BufferedInputStream(new FileInputStream(path));
			//bos = new BufferedOutputStream(new FileOutputStream(path2));
			int readNum = 0;
			long start = System.currentTimeMillis();
			//버퍼에 저장된 단위만큼 읽어 들인다(계란판,카트)
			//버퍼 단위로 한번에 여러번 작성 
			while((readNum = bis.read()) != -1 ) {
				bos.write(readNum);
			}
			long end = System.currentTimeMillis();
			System.out.println(end - start);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



