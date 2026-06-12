package ex2;

import java.util.Scanner;

public class Exam_IFElseIF {

	public static void main(String[] args) {
		// A~D 까지의 그룹값, 나머지는 흰색
		Scanner sc = new Scanner(System.in);
		System.out.println("그룹입력 : ");
		String gd = sc.nextLine();

		String color = "";

		/*
		 * //char group = gd.toUpperCase().charAt(0); // 문자입력이 소문자로 될수 있기 때문에 무조건 대문자로
		 * 변환
		 * 
		 * if(group == 'A') { color = "노랑색"; } else if(group == 'B') { color = "파란색"; }
		 * else if(group == 'C') { color = "빨간색"; } else if(group == 'D') { color =
		 * "검정색"; } else { color = "흰색"; }
		 */

		/*
		 * 다른버전(함수 직접 호출로 체크)
		 */
		if ('A' == gd.toUpperCase().charAt(0)) {
			color = "노랑색";
		} else if ('B' == gd.toUpperCase().charAt(0)) {
			color = "파랑색";
		} else if ('B' == gd.toUpperCase().charAt(0)) {
			color = "빨간색";
		} else if ('B' == gd.toUpperCase().charAt(0)) {
			color = "검정색";
		} else {
			color = "흰색";
		}

		System.out.println("당신은 " + gd.toUpperCase().charAt(0) + "그룹 이기 때문에 " + color + " 입니다.");

		sc.close();

	}

}
