package ex1;

import java.util.Scanner;

// 배열 선언, 생성, 초기화 하는 방법2

public class Ex2_Array2 {
	
	public static int[] makeArray(int inum)
	{
		int[] arr1;
		if(inum == 3)
		{
			arr1 = new int[inum];
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = inum+i;
			}
		}
		else
		{
			arr1 = new int[5];
			for (int i = 0; i < 5; i++) {
				arr1[i] = inum*i;
			}
		}		
		return arr1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("갯수 입력");
		
		int num = Integer.parseInt(sc.nextLine());
		
		// 메서드 정의
		// 갯수 입력 받아 입력 받은 갯수 만큼 배열 생성, 돌려 받는 메서드
		// makArray(int num) : int[]
		int[] arr = makeArray(num);
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		sc.close();
	}	
}
