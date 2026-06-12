package ex1;

public class Ex3_Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 메서드의 영역(지역)
		// 지역 상수 (final 키워드 선언시 해당 상수는 값 변경 불가)		
		final int MIN_NUM = 13222;
		System.out.println(MIN_NUM);
		
		final int MIN_NUM2;	// 상수선언
		MIN_NUM2 = 10; //초기화
		System.out.println(MIN_NUM2);
		
		final int MIN_NUM3;
		boolean etc = true;
		
		if(!etc)
		{
			MIN_NUM3 = 200;
		}
		else
		{
			MIN_NUM3 = 100;
		}
		
		System.out.println(MIN_NUM3);

	}

}
