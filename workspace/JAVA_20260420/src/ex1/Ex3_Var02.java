package ex1;

//디모션(캐스팅) : 큰자료형의 값을 적은 자료형에 넣을때
//오버플로우가 발생할 수 있음을 표시
//프로모션 : 작은 자료형 -> 큰자료형
public class Ex3_Var02 {
	public static void main(String[] args) {
		// 변수가 저장할 범위를 넘어 설때 솔루션 보려면 "Ctrl" + 1
		byte num = (byte) 129;

		num = 10;
		byte num2 = 20;
		
		// 4byte 미만의 자료형은 연산시 jvm이 int형 자료형으로 승격 시켜 연산처리함
		byte res = (byte) (num + num2);				
		
		System.out.println(res);
		
		int res2 = num + num2;	// 프로모션 발생
		System.out.println(res2);
	}
}
