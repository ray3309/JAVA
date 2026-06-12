package ex1;

public class Ex8_Logic {

	public static void main(String[] args) {
		int x = 10, y = 20;
		
		// AND 연산
		boolean result1 = (x > 5) && (y > 15);
		System.out.println("result1 = " + result1);		
		boolean result2 = (x > 15) && (y > 15);
		System.out.println("result2 = " + result2);
		
		// OR 연산
		boolean result3 = (x > 5) || (y < 15);
		System.out.println("result3 = " + result3);		
		boolean result4 = (x < 5) || (y < 15);
		System.out.println("result4 = " + result4);
		
		// NOT 연산
		boolean result5 = !(x > 5);
		System.out.println("result5 = " + result5);		
		boolean result6 = !(y < 15);
		System.out.println("result6 = " + result6);
	}

}
