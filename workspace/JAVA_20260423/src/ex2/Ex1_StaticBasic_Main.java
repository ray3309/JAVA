package ex2;

public class Ex1_StaticBasic_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1_StaticBasic ref = new Ex1_StaticBasic();
		System.out.println(ref.num1);		
		//System.out.println(num2);	//num2 가 해당 클래스에는 없으니 오류!!! Resolve : 클래스명.필드
		
		System.out.println(Ex1_StaticBasic.num2);

	}

}
