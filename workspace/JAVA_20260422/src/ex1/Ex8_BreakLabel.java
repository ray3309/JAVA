package ex1;

import java.util.Scanner;

// 무한 루프 -> While(ture), for(;;)

public class Ex8_BreakLabel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		for (int nLoop = 0;;) {
//			System.out.println("1-홀,2-짝,3-종료");
//			int userNum = Integer.parseInt(sc.nextLine());
//			System.out.println("Input Value : " + userNum);
//
//			if (userNum == 1) {
//				System.out.println("입력값 홀 [" + userNum + "]");
//				break;
//			} else if (userNum == 2) {
//				System.out.println("입력값 짝 [" + userNum + "]");
//				break;
//			} else {
//				System.out.println("종료됨");
//				break;
//			}
//		}
		

		// for break label
		exit:for (;;) {
			System.out.println("1-홀,2-짝,3-종료");
			int userNum = Integer.parseInt(sc.nextLine());
			System.out.println("Input Value : " + userNum);

			switch(userNum) {
			case 1 : System.out.println("당신은 홀을 입력!"); break;
			case 2 : System.out.println("당신은 짝을 입력!"); break;
			case 3 : System.out.println("종료"); break exit;
			default : System.out.println("메뉴 확인 ");
			}
		}
	
		sc.close();
	}
}
