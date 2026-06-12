package ex2;

import java.util.Scanner;

public class Ex1_ElseIF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력 : ");
		int age = Integer.parseInt(sc.nextLine());

		if (age >= 8) {
			System.out.println("학교에 다님");
		} else {
			System.out.println("학교에 안 다님");
		}

		// triple operator
		String sStr = (age >= 8) ? "학교에 다님" : "학교에 안 다님";
		System.out.println(sStr);
		
		sc.close();
	}

}
