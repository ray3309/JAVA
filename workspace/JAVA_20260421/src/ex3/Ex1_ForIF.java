package ex3;

import java.util.Scanner;

// 원하는 숫자 입력 초기, 조건값 반복
public class Ex1_ForIF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작값:");
		int sNum = Integer.parseInt(sc.nextLine());
		
		System.out.println("종료값:");
		int eNum = Integer.parseInt(sc.nextLine());
		
		// 빈칸 코드를 완성
		for(int i = sNum; i < eNum; i++)
		{
			System.out.println(i);
		}
		
		sc.close();
		
	}

}
