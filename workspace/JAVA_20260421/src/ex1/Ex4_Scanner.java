package ex1;

import java.util.Scanner;

public class Ex4_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름:");
		String name = sc.nextLine();

		System.out.println("지역:");
		String loc = sc.nextLine();

		System.out.println("나이:");
		// int ageStr = sc.nextLine();
		int ageStr;
		ageStr = Integer.parseInt(sc.nextLine());

		System.out.println("색깔");
		String color = sc.nextLine();

		System.out.println("당신의 이름은 => " + name + " 입니다.");
		System.out.println("당신의 사는 곳 => " + loc + " 입니다.");
		System.out.println("당신의 나이 => " + ageStr + " 입니다.");
		System.out.println("당신이 좋아 하는 색상 => " + color + " 입니다.");

		if (ageStr <= 19) {
			System.out.println("미성년");
		} else {
			System.out.println("성년");
		}
		
		sc.close();

	}
}
