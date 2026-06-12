package ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//파일[바이트] 을 읽어[FileInputStream]
//InputStream / OutputStream : 이미지,영상,문자 포함해서 1바이트씩 읽어 드리기
//위해서 자바에서 제공해주는 클래스
//-- 미션 
//파일 복사
//파일[바이트] 을 읽어[FileInputStream]들이면서 작성[FileOutputStream]하는 개념 
//- 1byte씩 읽으면서 1byte씩 작성한다.
//- 파일의 끝의 값 : -1
//- 반복문 
//- 경로 : 원본 -> 사본 
public class Ex1_FileInputStrem {
	public static void main(String[] args) {
		// 원본 경로
		String path = "D:\\ictstudy\\jdk\\openjdk.zip";
		// 복사될 경로
		String path2 = "D:\\ictstudy\\target\\myjdk.zip";
		File f = new File(path);
		System.out.println(f.exists()); // true

		try (FileInputStream fis = new FileInputStream(path); 
				FileOutputStream fos = new FileOutputStream(path2);) {
			// 1바이트씩 저장할 변수를 선언
			int readNum = 0;
			// fis.read() => 1바이트씩 파일에서 읽어 오는 메서드
			// while(n.hasNaxt())
			long start = System.currentTimeMillis();
			//readNum에 1바이트씩 저장할 수 있으면 true , -1 이면 종료
			//파일에서 1바이트씩 읽어 냄
			while((readNum = fis.read()) != -1) {
				//읽어 낸 것을 작성 
				fos.write(readNum);
			}
			long end = System.currentTimeMillis();
			System.out.println(end - start);
			//true
			//349749
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
