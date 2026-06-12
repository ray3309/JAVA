package ex3;

public class Ex3_ForIF {

	public static void main(String[] args) {
		// 1~10 세로로 출력
		
		for(int nLoop = 1; nLoop < 11; ++nLoop)
		{
			if(nLoop%2 == 0)
			{
				System.out.print( nLoop + "는 짝수,");
			}
			else
			{
				System.out.print( nLoop + "는 홀수,");
			}
		}

	}

}
