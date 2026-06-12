package ex1;

public class Ex8_Primitive {

	public static void main(String[] args) {
		
		// float 선언
		float fnum;
		fnum = (float)3.14;	// why 캐스팅? 3.14는 기본이 double
		
		// float 즉 4바이트에 저장하기 위해 실수에 반드리 F, f를 붙여야 함		
		fnum = 3.14f;
		
		// double 선언
		double dnum = 3.14;
		System.out.println("float -> " + fnum);
		System.out.println("double -> " + dnum);
			
		double dnum2 = fnum;	// Promotion
		System.out.println(dnum2);

	}

}
