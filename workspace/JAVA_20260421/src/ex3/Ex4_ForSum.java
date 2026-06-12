package ex3;

public class Ex4_ForSum {

	public static void main(String[] args) {
		
		int nSum = 0, nEndNum = 10;
		
		for(int nLoop = 1; nLoop < nEndNum+1; nLoop++)
		{
			nSum += nLoop;
		}
		
		System.out.println("1 부터 " + nEndNum + " 까지 합산 결과 : " + nSum);

	}

}
