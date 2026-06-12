package basic;

public class Ex2_TowArray {
	
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
//		System.out.println("2차원 배열 길이 :" + arr.length);
//		System.out.println("2차원 배열내부 1차원 길이:" + arr[0].length);
//
//		System.out.println("배열 요소 값 5=>" + arr[1][1]);
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++)
//				System.out.println("[" + i + "]" + arr[i][j] + "\t");
//		}
//		System.out.println();
		
		// foreach
		
		int nCount = 0;
		for (int[] is : arr)
		{	
			int nCount2 = 0;
			for( int is2 : is)
			{				
				System.out.print("[" + nCount + "]" + "[" + nCount2 + "]" + is2 + "\t");				
				nCount2++;				
			}
			nCount++;
			System.out.println("");
		}
	}
}

