package basic;

// 다형성

public class TestA {
	
	public int myTest(int n) {
		int res = n+10;
		return res;
	}
	
	public String myTest(String str) {
		
		char res = str.charAt(0);
		return String.valueOf(res);
	}
	
	public int[] myArr(int idx, int val) {
		int[] arr = {10, 20, 30};
		arr[idx] = val;
		return arr;
	}
		
	public static void main(String[] args) {
		
		TestA ref = new TestA();

		@SuppressWarnings("unused")
		int n1 = ref.myTest(10);
		
		@SuppressWarnings("unused")
		String res = ref.myTest("Test");
		
		@SuppressWarnings("unused")
		int[] arr = ref.myArr(0, 10);
	}

}
