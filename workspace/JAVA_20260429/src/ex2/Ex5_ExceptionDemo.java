package ex2;

import java.util.Scanner;

public class Ex5_ExceptionDemo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.print("수 입력:");
		try {
			int num = Integer.parseInt(sc.nextLine());
			int res = 10/num;
			System.out.println("입력한 수:"+num);
			System.out.println("연산 결과:"+res);
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("숫자나 0이 아닌 값만 입력이 가능합니다.");
		} 
	sc.close();
	}
}
}
