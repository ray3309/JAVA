package ex1;

public class Ex6_Primitive {
	public static void main(String[] args) {
		
		// char 타입은 2바이트 이면서 기본값이 유니코드
		char var1 = '\u0000';
		System.out.println("초기값:" + var1);
		
		System.out.println("------------ 개념 응용 ------------");
		char ch1 = 'A';
		short ch2 = 1;
		
		char res = (char)(ch1 + ch2);
		System.out.println(res);
		
	}

}
