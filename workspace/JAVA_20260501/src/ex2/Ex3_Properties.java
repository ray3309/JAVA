package ex2;

import java.io.FileReader;
import java.util.Properties;

//Properties , properties란 <파일>에 key=value형식으로
//데이터를 저장한다. *****
public class Ex3_Properties {
	// Properties 선언
	private Properties prop;
	// 파일의 경로를 저장 변수 선언
	private String path;

	public Ex3_Properties() {
		// Properties 생성
		prop = new Properties();
		path = "src/ex2/my.properties";
	}

	// my.properties 읽어와서 반환
	// FileReader : 파일의 내용을 문자단위(2바이트)로 읽어 들이는 스트림 객체
	public String message(String msg) {
		String res = "";
		try (FileReader fr = new FileReader(path)) {
			// 파일 스트림을 통해서 파일에 연결된 fr 주소를
			// Properties 전달한다.
			// 해당 스트림으로 부터 키/값 형식으로 읽어 들인다. -> load메서드
			prop.load(fr);
			// getProperty(key,"키가 없을때 Value로 반환"):Value
			res = prop.getProperty(msg, "그런 단어는 모릅니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

}
