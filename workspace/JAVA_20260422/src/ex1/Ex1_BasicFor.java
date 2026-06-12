package ex1;

// Extern Class를 가져오기 위한 방법
import java.util.Scanner;

public class Ex1_BasicFor {
	// 모든 실행은 메소드 {} 정의 해야 함
	public static void main(String[] args) {
		
		// 입력 받기
		// 참조차료형 변수 = new 자료형과 같은 클래스(); ==> 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("범위 입력");		
		
		int nlimit = Integer.parseInt(sc.nextLine());		
		System.out.println("limit => " + nlimit);
		
		//입력 받은 만큼 반복
		for(int nLoop = 0; nLoop <= nlimit; nLoop++){
			System.out.println("Number = " + nLoop);
		}
				
		sc.close();
	}
}
