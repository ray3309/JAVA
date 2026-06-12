package ex2;

public class Ex2_ElseIF {

	public static void main(String[] args) {
		int num = 9;

//		if (num >= 10)
//			System.out.println(num + "은 10보다 크다.");
//			System.out.println("하하하!");
//			System.out.println("-----------------------");

		int cnt = 0;
		if (num == 9 || (cnt += 1) > 0) {
			System.out.println("실행1");
		}
		if (num == 8 || (cnt += 1) > 0) {
			System.out.println("실행2");
		}
		if (num == 7 || (cnt += 1) > 0) {
			System.out.println("실행3");
		}
		System.out.println("if문이 더 실행된 횟수 :" + (cnt + 1));

		cnt = 0;
		if (num == 9 || (cnt += 1) > 0) {
			System.out.println("실행1");
		} else if (num == 8 || (cnt += 1) > 0) {
			System.out.println("실행2");
		} else if (num == 7 || (cnt += 1) > 0) {
			System.out.println("실행3");
		}
		System.out.println("if문이 더 실행된 횟수 :" + cnt);
	}
}
