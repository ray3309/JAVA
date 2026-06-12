package ex1;

public class Ex4_Construct2 {
	int num;

	public Ex4_Construct2(int n) {
		num = n;
		System.out.println("생성자 호출 될때 받은 매개변수 값 : " + num);
	}

	public int getNum() {
		return num;
	}

	public static void main(String[] args) {		
		int num = 100;	// 지역변수		
		Ex4_Construct2 ref = new Ex4_Construct2(num);		
		int res = ref.getNum();
		System.out.println("getNum() => "+res);
		
		num = 200;
		Ex4_Construct2 ref2 = new Ex4_Construct2(num);
		int res2 = ref2.getNum();
		System.out.println("getNum() => "+res2);
	}
}
