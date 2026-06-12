package exam;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생이름 입력:");
		String name = sc.nextLine();
		Student s1 = new Student(name);

		try {
			System.out.print("점수는 0~100 사이:");
			int score = Integer.parseInt(sc.nextLine());
			s1.setScore(score); // 잘못된 점수 입력
			System.out.println(name + "학생의 점수는 " + score + "입니다.");
		} catch (ScoreException e) {
			System.out.println("예외 발생: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("점수는 반드시 숫자여야 합니다.");
		}

		sc.close();
	}
}
