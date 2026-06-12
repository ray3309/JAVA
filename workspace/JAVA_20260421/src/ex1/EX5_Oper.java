package ex1;

import java.util.Scanner;

public class EX5_Oper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수1 numA:");
		int numA = Integer.parseInt(sc.nextLine());
		
		System.out.println("수2 numB:");
		int numB = 2;
		
		int resNum1 = numA + numB;
		int resNum2 = numA - numB;
		int resNum3 = numA * numB;
		int resNum4 = numA / numB;
		int resNum5 = numA % numB;
		
		System.out.println(numA+" + "+numB+" = "+ resNum1);
		System.out.println(numA+" - "+numB+" = "+ resNum2);
		System.out.println(numA+" * "+numB+" = "+ resNum3);
		System.out.println(numA+" / "+numB+" = "+ resNum4);
		System.out.println(numA+" % "+numB+" = "+ resNum5);		
		
		sc.close();
	}

}
