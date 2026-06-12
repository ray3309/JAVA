package ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

// Req
// 1.검색 후 저장, 2.출력, 3. 종료 
// 1일때 웹사이트 검색해서 가져온 데이터를 site1.txt 저장
// 2일때 저장한 site1.txt를 불러와서 출력
// 3일때 종료

public class Exam5_UrlDemo {

	private String searchUrl = "";

	// searchUrl 멤버필드가 private 이기 때문에 getter/setter 메소드들을 정의함
	public String getSearchUrl() {
		return searchUrl;
	}

	public void setSearchUrl(String searchUrl) {
		this.searchUrl = searchUrl;
	}

	public void searchSave() throws Exception {
		// JAVA 20 부터 URL x = new URL(String) 문법은 Deprecated(제거) 되어 있으므로,
		// 하기 코드 처럼 사용해야 함
		URL oUrl = (new URI(getSearchUrl())).toURL();

		// 인터넷 주소에서 데이터를 받아오기 위한 스트림 객체
		InputStream is = oUrl.openStream();

		// BufferedReader 와 BufferedWriter 객체를 try~with~resources 형식으로 선언하여 사용(리소스 자동정리)
		// BufferedReader 와 BufferedWriter 는 모두 2차 스트림이므로, 해당 객체들은 직접 파일에 접근을 하지 못하기에
		// InputStreamReader 와 FileWrite라는 1차 스트림 객체를 연결하여 사용하도록 함
		try (BufferedReader br = new BufferedReader(new InputStreamReader(is));
				BufferedWriter bw = new BufferedWriter(new FileWriter("src/ex1/site1.txt"))) {

			String read = null;
			while ((read = br.readLine()) != null) {
				bw.write(read);
				bw.newLine(); // 줄바꿈 처리
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> listSite() throws Exception {

		// 스트림으로 읽어 들인 데이터를 라인단위로 저장하기 위한 배열리스트 객체 생성
		ArrayList<String> arrlistSite = new ArrayList<String>();

		// BufferReader에 readline 메소드가 있기 때문에 해당 객체를 생성하고,
		// BufferReader는 2차 스트림이기 때문에 파일에 직접 연결을 하지 못하므로, FileReadr 라는 1차 스트림으로 연결한다.
		try (BufferedReader br = new BufferedReader(new FileReader("src/ex1/site1.txt"))) {
			String readv = null;
			while ((readv = br.readLine()) != null) {
				arrlistSite.add(readv); // 라인단위 읽어들인 데이터를 배열리스트에 저장
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return arrlistSite;
	}

	public static void main(String[] args) throws Exception {

		// sc 리소스 객체를 자동으로 닫아주기 위해 try~with~resource 구문으로 변경
		try (Scanner sc = new Scanner(System.in)) {
			Exam5_UrlDemo ref = new Exam5_UrlDemo();
			ext: while (true) {
				System.out.println("1.검색후 저장 ,2.출력 ,3.종료 ");
				switch (Integer.parseInt(sc.nextLine())) {
				case 1: {
					System.out.println("검색할 사이트명 입력: ");
					ref.setSearchUrl(sc.nextLine()); // 입력받은 url을 setter 메소드를 사용해서 셋팅
					ref.searchSave(); // 검색저장 메소드 호출
				}
					break;
				case 2:
					ArrayList<String> site = ref.listSite();

					// site 라는 ArrayList Collection 객체에 저장한 내용을 for~each구문을 사용하여 출력
					for (String string : site) {
						System.out.println(string);
					}
					break;
				case 3:
					System.out.println("종료");
					break ext;

				default:
					System.out.println("올바른 메뉴가 아님");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
