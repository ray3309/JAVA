package ex4;

import java.util.Scanner;

// Multiple For
public class Ex1_ForFor {

	public static void main(String[] args) {
//		step1();
		step2();
	}

//	private static void step1() {
//		// System.out.println("setp1() 실행!");
//
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.print(j + "x" + i + "=" + (j * i) + "\t");
//			}
//			System.out.println("");
//		}
//		System.out.println("------ For문 종료 ------");
//	}

	private static void step2() {
		int nDan = 0, nRange = 0;//, nStart = 0, nEnd = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("단 입력");
		nDan = Integer.parseInt(sc.nextLine());

		System.out.println("범위(1,3,5,7,9) => ");
		nRange = Integer.parseInt(sc.nextLine());

		//nStart = nDan - (nRange / 2);
		//nEnd = nDan + (nRange / 2);

		System.out.println("범위값 검수");
		System.out.println("start : " + (nDan - (nRange / 2)));
		System.out.println("end : " + (nDan + (nRange / 2)));

		for (int i = 0; i < 10; i++) {

			for (int j = (nDan - (nRange / 2)); j < (nDan + (nRange / 2))+1; j++) {
				if (i == 0) {
					System.out.print(j + "단\t");
				} else {
					System.out.print(j + "x" + i + "=" + (i * j) + "\t");
				}
			}
			System.out.println("");
		}

		System.out.println("---------For문 종료---------");
		sc.close();

	}

}
