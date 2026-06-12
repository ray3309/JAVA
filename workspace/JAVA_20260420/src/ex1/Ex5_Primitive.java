package ex1;

public class Ex5_Primitive {

	public static void main(String[] args) {
		// 1 Byte 즉 8bit : -128 ~ 127 범위
		// 테스트 값 200일 경우 byte d = (byte)200; //정상적인 값이 안나옴
		// 당연히 -128 ~ 127 범위 넘어 서면 byte에 저장 할 수 없다.
		byte d = 100, e = 10;
		// println(d); 실행되는 순간 모두 문자열로 변경이 된다.
		System.out.println(d);// 100
		
		byte res1 = (byte)(d+e);		
		
		System.out.println("캐스팅 결과 =>" + res1);
		
		// short 자로형 변수 c1=50, c2=50를 각각 선언해서 특정 값을 저장 하고,
		// 더하기 연산 수행한 후 그 값을 short형 변수 c_res1에 저장한 후 출력하시오
		short c1=50, c2=50;
		short c_res1 = (short)(c1+c2);
		
		System.out.println(c_res1);
		
		
		
		System.out.println("--------Long Type --------");
		
		// Long Type 8byte, 64bit
		// int type 4byte, 32bit 범위 넘겨 보기
		//int l_num = 10000000000L;	// overflow
		long l_num2 = 10000000000L;	// L은 리터럴상수(L,l 리터럴 접미사 부여)		
		System.out.println(l_num2);
		
		
		// 시스템의 표준 시간대를 초단위로 돌려주는 함수는 사용
		// 그 값을 변수에 저장
		// System.currentTimeMillis() : 현재 초단위의 값을 정수로 돌려줌
		System.out.println("Value Check = " + System.currentTimeMillis());
		
		int time1 = (int) System.currentTimeMillis();
		System.out.println("Worng Value Check = " + time1);
		
		long time2 = System.currentTimeMillis();
		System.out.println("Correct Value Check = " + time2);
	}

}
