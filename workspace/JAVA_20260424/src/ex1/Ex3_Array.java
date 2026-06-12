package ex1;

import java.util.Scanner;

// 가변 길이 배열;

public class Ex3_Array {

	private int[] numArray;
	private int nn;
	
	public void createNumArray(int arrType) {
		if(arrType == 1)
		{
			nn = 10;
			
			numArray = new int[] {100,200,300};			
		}
		else
		{
			numArray = new int[] {1000, 2000, 3000};
		}
		
	}
	
	public void printNumArray()
	{
		System.out.println("NN=>"+nn);
		for (int i : numArray) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		Ex3_Array ar = new Ex3_Array();
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 타입 선택:");
		ar.createNumArray(Integer.parseInt(sc.nextLine()));
		
		ar.printNumArray();
		
		sc.close();
	}
}
