package ex2;

import java.util.Scanner;

public class Ex6_ExceptionDemo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.print("수 입력:");
		try {
			int num = Integer.parseInt(sc.nextLine());
			int res = 10/num;
			System.out.println("입력한 수:"+num);
			System.out.println("연산 결과:"+res);
		} catch (Exception e) {
			//선언된 e변수 즉 Exception 이 NumberFormatException 과 같은 가족관계인가
			if (e instanceof NumberFormatException) {
				System.out.println("숫자만 입력이 가능합니다.");
			} else if(e instanceof ArithmeticException){
				System.out.println("분모는 0이 될 수 없습니다.");
			}
		} 
	sc.close();
	}
}
}
