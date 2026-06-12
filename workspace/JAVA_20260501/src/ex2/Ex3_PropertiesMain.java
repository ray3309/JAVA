package ex2;

import java.util.Scanner;

public class Ex3_PropertiesMain {
public static void main(String[] args) {
	Ex3_Properties ref = new Ex3_Properties();	
	ext:while(true) {
		System.out.print("Menu 1-대화,3-종료 :");
		try(Scanner sc = new Scanner(System.in);) {
			int menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1:
				System.out.print("대화:");
				String msg = sc.nextLine();
				String res = ref.message(msg);
				System.out.println("답변:"+res);
				break;
			case 3:
				System.out.println("대화를 종료 합니다.");
				break ext;
			default:
				System.out.println("메뉴에 있는 숫자만 입력하세요!");
			}
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요!");
		}
		
	}
	
}
}
