package ex1;

public class Ex2_Array {

	private static void intType() {
		int[] numArr1 = {100,200,300};
		int n = 300;
		
		printNumArray(numArr1, n);
		
		System.out.println("intType 일반 변수:"+n);
		System.out.println("------------------");
		
		for (int i : numArr1) {
			System.out.println(i);
		}
	}

	public static void printNumArray(int[] numArr, int n)
	{
		n = 500;
		numArr[0] = 100;
		System.out.println("printNumArray의 일반변수 : "+n);
		System.out.println("printNumArray의 배열 출력 : ");
		for(int i : numArr)
		{
			System.out.println(i);
		}
	}
		
	public static void main(String[] args) {
		intType();
	}
}
