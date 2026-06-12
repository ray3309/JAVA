package ex1;

import java.util.Scanner;

public class Ex5_Switch_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("msg1 =>");
		String msg1 = sc.nextLine();
//		System.out.println("msg2 =>");
//		String msg2 = sc.nextLine();	
//		System.out.println(msg1 == msg2);
		
//		if (msg1.equals("Test")) {
//			System.out.println("msg1 입력값이 Test 이다.");
//		} else {
//			System.out.println("msg1 입력값이 Test와 다르다.");
//		}
		
		System.out.println("======== Switch ========");		
		switch(msg1)	// switch에서는 equals 메소드를 사용할 필요 없음
		{
		case "Test":
			System.out.println("msg1 입력값이 Test 이다.");
			break;		
		default:
			System.out.println("msg1 입력값이 Test와 다르다.");
		}
		
		sc.close();
	}

}
