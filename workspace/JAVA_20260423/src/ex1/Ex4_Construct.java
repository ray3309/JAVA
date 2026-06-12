package ex1;

public class Ex4_Construct {
	int num;

	public Ex4_Construct(int n) {
		num = n;
		System.out.println("생성자 호출 될때 받은 매개변수 값 : " + num);
	}

	public int getNum() {
		return num;
	}

	public static void main(String[] args) {		
		//Ex4_Construct ex = new Ex4_Construct();
		int num = 100;	// 지역변수		
		Ex4_Construct ref = new Ex4_Construct(num);
		int res = ref.getNum();
		System.out.println("getNum() => "+res);
		
	}
}
