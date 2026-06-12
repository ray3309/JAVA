package ex3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Writer
//정리) 특정<파일>에 어떤 <문자열>들을 작성하고 싶다.
//1번) 특정파일에 문자열 저장 => FileWriter 
//2번) 버퍼를 이용해서 문자열을 빠르게 저장하고 싶다 
//=> bw = new BufferedWriter(new FileWriter(경로));
//3번) 이미 생성된(경로에 파일을 빠르게 저장하기위한 객체) 주소로(bw) 
//- 접근해서 bw. - bw.메서드를 호출(write,write(byte[]) - 메서드를 사용해서 저장하는 일 
//4번) bw.flush();
//5번) bw.close();
public class EX2_FileReader_Writer {
	private String path;
	public EX2_FileReader_Writer() {
		path = "src/ex3/demo1.txt";
	}
	public void msgWriter(String msg) {
		System.out.println(msg);
		//new FileWriter(path,append) 파일이 존재하지 않으면 파일 만들어 준다. *****
		//new FileWriter(path,append) : true주면 이어쓰기 즉 append가 된다.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true));){
			bw.write(msg);// 문자열을 한번에 파일로 작성하는 메서드
			bw.newLine();// 개행을 시켜주는 메서드
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    public String msgReader() {
    	//읽어올 path 파일이 없으니 java.io.FileNotFoundException
			try (BufferedReader br = new BufferedReader(new FileReader(path));){
				String readV = null;
				// br.readLine() 문자열을 한줄씩 읽어 오다가 파일의 끝에 도달했을 때는 null이기 때문에
				// while은 null이 아닐때까지 한줄 씩 읽어서 readV에 저장한다.
				String res = "";
				while ((readV = br.readLine()) != null) {
					res += readV + "\n";
				}
				return res;
			} catch (Exception e) {
				e.printStackTrace();
				return "파일내용 읽기 실패!";
			}
	}
    public static void main(String[] args) {
    	EX2_FileReader_Writer ref = new EX2_FileReader_Writer();
    	//ref.msgReader();
    	//ref.msgWriter("안녕하세요!");
    	Scanner sc = new Scanner(System.in);
    	ext: while (true) {
			System.out.print("1:작성,2:출력,3:종료");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				System.out.print("Message:");
				String msg = sc.nextLine();
				// 입력메서드 호출
				ref.msgWriter(msg);
				break;
			case 2:
				String reMsg = ref.msgReader(); // 출력 메서드 호출 :: 데이터 반환
				System.out.println(reMsg);
				break;
			case 3:
				System.out.println("프로그램 종료");
				break ext;
			default: break;	
			}// 스위치문 영역 종료	
		}// while문 종료
    	
    	sc.close();
	}
    
}
