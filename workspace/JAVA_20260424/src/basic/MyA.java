package basic;

public class MyA {
	int n;	//Member Var;

	// n값을 초기화 할 매개변수 정수인 생성자를 정의
	public MyA(int n) {		
		this.n = n;
	}
	
	public String msg() {
		return "당신이 입력한 값은 " + n + "입니다.";		
	}
	
	

}
