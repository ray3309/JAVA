package exam;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int m = 0, n = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("m값을 입력하세요.");
		m = Integer.parseInt(sc.nextLine());

		System.out.println("n값을 입력하세요.");
		n = Integer.parseInt(sc.nextLine());

		for (int nLoop = 1; nLoop < m + 1; nLoop++) {

			System.out.print(nLoop + " ");

			if (nLoop % n == 0) {
				System.out.println("");
			}
		}

		sc.close();
	}

}
