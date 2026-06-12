package ex1;

public class Ex1_Array {
	@SuppressWarnings("unused")
	private static void test1() {
		int st1 = 1;
		int st2 = 2;
		int st3 = 2;
		int st4 = 100;
		int sti = 0;
		
		for(int i = 0; i<3; i++)
		{
			System.out.println(st1);
			System.out.println(st2);
			System.out.println("int st" + (i+1) + "=" + i);
			sti = i;			
		}
		System.out.println(sti);
	}
	
	public static void test2() {
		
		int[] inum = {1,2,100};
		System.out.println("배열의 길이 :" + inum.length);
		// 배열은 index로 접근 해서 배열의 값을 가져와서 출력
		System.out.println("첫번째 index 0의 값 => " + inum[0]);
		System.out.println("첫번째 index 1의 값 => " + inum[1]);
		System.out.println("첫번째 index 2의 값 => " + inum[2]);
				
		inum[1] = 1000;
		System.out.println("index 1의 값 =>"+inum[1]);
		System.out.println("-------- for문 출력 --------");
		
//		for (int i = 0; i < inum.length; i++) {
//			System.out.println("index [" +i+ "] 의 값 =>" + inum[i]);
//		}
		
		for(int e : inum){
			System.out.println(e);
		}
		
//		int[] inum2;
//		inum2 = inum.clone();
//		
//		for (int i = 0; i < inum2.length; i++) {
//			System.out.println("index [" +i+ "] 의 값 =>" + inum2[i]);
//		}

		
	}
	
	public static void main(String[] args) {	
		// for-each ( 요소를 처음부터 끝까지 순회 할때 사용)
		// for(String e : lib)
		//{
		
		//}
		test2();
		
	}
}
