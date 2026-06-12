package ex2;

import java.io.File;

//디렉토리가 존재하지 않으면 생성 *****
//mkdir(): 하위 경로 하나만 만들 수 있다.
//mkdirs() 하위 경로를 추상경로로 취급해서 만들 수 있다.
//work/aaa
//work/[aaa]/[bbb]
public class Ex3_FileMkdir {
	public static void showPath(String orifile) {
		// 문자열 경로 File객체를 생성한다.
		File f1 = new File(orifile);
		// 생성된 File 의 주소변수 f1로 부터 파일이나 디렉토리의 목록을
		// File[] 로 담아서 반환 해주는 listFiles() 호출한다.
		File[] list = f1.listFiles();
		// 파일객체들이 들어간 배열을 반복하면서
		// 해당 if문에 맞게 출력
		for (File e : list) {
			if (e.isDirectory()) {
				System.out.println("Directory =>" + e.getName());
			} else {
				System.out.println("File =>" + e.getName());
			}
		}
	}

	public static void main(String[] args) {
		// 전체 경로
		String oripath = "D:\\ictstudy\\java\\workspace\\java0504\\src\\ex2\\";
		// 전체 경로 아래에 하위 추상 경로
		String path = oripath + "mysample\\mywork\\aaa";
		// path를 가지고 파일클래스를 생성
		File f1 = new File(path);
		// if문으로 경로가 존재하지 않으면 =>"해당 경로가 존재하지 않습니다. 그래서 만들겠습니다."
		// 아니면 "이미 존재하는 경로입니다."
		if (!f1.exists()) {
			System.out.println("해당 경로가 존재하지 않습니다. 그래서 만들겠습니다.");
			//f1의 메서드 mkdirs() 사용
			f1.mkdirs();
			showPath(oripath);
		} else {
			System.out.println("이미 존재하는 경로입니다.");
			showPath(oripath);
		}
	}
}






