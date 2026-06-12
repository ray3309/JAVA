package exam;

import java.util.Scanner;

public class MyStackDemoMain {
	public static void main(String[] args) {
		MyStackDemo ref = new MyStackDemo();
		ext: while (true) {
			try (Scanner sc = new Scanner(System.in);) {
				System.out.print("1.입력,2출력,3종료:");
				int menu = Integer.parseInt(sc.nextLine());
				switch (menu) {
				case 1:
					System.out.print("정수 입력:");
					int snum = Integer.parseInt(sc.nextLine());
					ref.addStack(snum);
					System.out.println("Top:" + ref.current());
					break;
				case 2:
					// ------------------------
					if (!ref.getStack().isEmpty()) {
						System.out.println("스택 전체 출력:");
						while (!ref.getStack().isEmpty()) {
							System.out.println(ref.getMyStack()); // 스택에서 꺼내는 메서드
						}
					} else {
						System.out.println("스택이 비어있습니다.");
					}
					// ------------------------
					break;
				case 3:
					System.out.println("프로그램 종료");
					break ext;
				default:
					System.out.println("잘못된 메뉴 선택");
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
