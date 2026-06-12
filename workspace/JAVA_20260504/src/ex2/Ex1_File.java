package ex2;

import java.io.File;
import java.io.IOException;

//File클래스 : 파일이 존재하는 추상경로를 생성자로 입력하면 일단 객체로 생성된다.
//추상경로: 아직만들어지지 않는 디렉토리, 파일 의미한다.
public class Ex1_File {

	public static void main(String[] args) {
		// 실습 1) 해당 경로에서 파일은 존재하지 않는다.
		String path = "src/ex2/demo.txt";
		// 추상적인 경로를 기반으로 파일객체를 생성한다.
		File f = new File(path);
		System.out.println(f);
		// 메서드를 잘알고 활용
		// 존재 유무 반환 
		System.out.println(f.exists()); //false
		//만약 파일/(경로)이 존재않으면 - 파일 만들면되고 
		// 있으면 파일의 정보를 보여주면 - 파일등등 
		if (!f.exists()) {
			System.out.println("파일이 존재하지 않음");
			
			try {
				//touch fileName -> 0byte 빈파일을 생성 
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("작성권한이 없다 -> "+f.canWrite());  //false
			}
		} else {
			//File객체가 제공해주는 메서드 확인 테스트
			System.out.println("파일이 존재함 ");
			System.out.println("파일인가? :" + f.isFile()); // *
			System.out.println("실행이 가능한가? :" + f.canExecute());
			System.out.println("작성이 가능한가? :" + f.canWrite());
			System.out.println("절대경로 :" + f.getAbsolutePath()); // *
			System.out.println("파일 이름 :" + f.getName()); // *
			System.out.println("디렉토리니? :" + f.isDirectory()); // *
			System.out.println("파일의 길이 :" + f.length()); // *			
		}
	}
}
