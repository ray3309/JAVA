package ex1;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//1.demoExam.txt를 path로 지정하기 위한 변수 선언하기

//2. 생성자로 초기화시 path값 초기화 하기 

//3.demoExam.txt에 글을 작성하는 메서드 정의하기 : void 
//이때 이어쓰기가 가능

//4. demoExam.txt 들어간 모든 글을 출력하는 메서드 정의하기
//반환값이 있으면 좋음 (return ArrayList)

//5. 메인메서드
// Exam7_ReaderDemo 생성하고  ref

// ref로 3.글을 작성하는 메서드 호출해서 글을 한줄 단위로 저장해보기

// ref로 모든 글을 출력하는 메서드로 부터 반환값을 받은 후
// 반복문으로 출력해보기

public class Ex7_ReaderDemo {
	public String path = "";

	public Ex7_ReaderDemo(String path) {
		this.path = path;
	}

	public void writeDemoExam(String msg) throws FileNotFoundException {

		try (PrintWriter pw = new PrintWriter(new FileWriter(path, true));) {
			System.out.println("writeDemoExam Begin");
			pw.append(msg);
			System.out.println("writeDemoExam End");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> readerDemoExam() {

		ArrayList<String> arrList = new ArrayList<String>();

		try (Scanner sc = new Scanner(new File(path))) {
			while (sc.hasNext()) {
				arrList.add(sc.nextLine()); // 라인단위 읽어들인 데이터를 배열리스트에 저장
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arrList;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Ex7_ReaderDemo ref = new Ex7_ReaderDemo("src/ex1/demoExam.txt");

		try (Scanner sc = new Scanner(System.in)) {
			ext: while (true) {
				System.out.println("1.입력 ,2.출력 ,3.종료 ");
				switch (Integer.parseInt(sc.nextLine())) {
				case 1: {
					System.out.println("기록한 텍스트 입력: ");
					ref.writeDemoExam(sc.nextLine());
				}break;
				case 2: {
					ArrayList<String> TextArray = ref.readerDemoExam();

					// for-each
					for (String string : TextArray) {
						System.out.println(string);
					}

					// iterator
					Iterator<String> it = TextArray.iterator();
					while (it.hasNext()) {
						String e = it.next();
						System.out.println(e);
					}

				}break;
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
