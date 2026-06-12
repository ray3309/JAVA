package ex2;

public class Ex2_StaticBasic {
	static int num1;	//static 변수
	int num2;			//인스턴스 변수
	
	public Ex2_StaticBasic(int num1, int num2) {
		Ex2_StaticBasic.num1 = num1;
		this.num2 = num2;
	}
	
	public void incNum()	{
		num1 += 1;	//static
		num2 += 1;	//instance => non static
		System.out.println(""+num2);
	}
	
	public static void incStaticNum(){
		num1 += 1;		
		//num2 += 1;	//==>증가 못시키는 이유는? A. 해당 메소드는 static이므로 static 메모리 영역에 존재함, 그러기에 해당 함수를 호출 하면
						//                      Static 메모리 영역에서 num2 변수를 찾는데 해당 변수는 static으로 선언이 안되어 있으니, 오류가 발생
	}
	
	public void resultVal()	{
		System.out.println("static변수:"+num1);
		System.out.println("instance변수:"+num2);
	}
	
	public static void main(String[] args){
		// 하나의 클래스로 두 객체를 생성 - 주소 다름
		Ex2_StaticBasic sb = new Ex2_StaticBasic(0, 0);		
		Ex2_StaticBasic sb2 = new Ex2_StaticBasic(0, 0);
		
		sb.incNum();	
		sb2.incNum();
		
		sb.resultVal();
		System.out.println("-----------------------------");
		sb2.resultVal();
		System.out.println("-----------------------------");
		
		Ex2_StaticBasic.incStaticNum();
	}
}
