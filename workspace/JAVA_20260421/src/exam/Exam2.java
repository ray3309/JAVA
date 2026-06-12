package exam;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		int studentCount = 0, score = 0, sumscore = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("학생 수를 입력해주세요.");
		studentCount = Integer.parseInt(sc.nextLine());

		for (int nLoop = 1; nLoop < studentCount + 1; nLoop++) {
			System.out.println(nLoop + "번 째 학생 점수 입력:");
			score = Integer.parseInt(sc.nextLine());

			if (score >= 90) {
				System.out.println("등급:A");
			} else if (score >= 80 && score <= 89) {
				System.out.println("등급:B");
			} else if (score >= 70 && score <= 79) {
				System.out.println("등급:C");
			} else if (score >= 60 && score <= 69) {
				System.out.println("등급:D");
			} else {
				System.out.println("등급:F");
			}
			sumscore += score;
		}

		System.out.println("총 " + studentCount + "명의 점수" + sumscore);
		
		sc.close();

	}
}
