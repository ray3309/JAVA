package ex1;

import java.util.Vector;

//Collection - 오직 객체만 저장한다.
//모든 참조 자료형을 저장할 공간 Vector를 선언
//배열과 다른점 - 크기가 고정이 아니다.
//배열처럼 index를 가지고, 0부터 시작한다.
//List인터페이스의 구현 클래스 , 동기화<Thread> 지원 
public class Ex1_Vector {
	private Vector<Object> v; // Object자료형
	// 벡터는 용량을 가지고 있고, 용량을 넘어 서면 자동으로 늘려준다.
	public Ex1_Vector() {
		v = new Vector<Object>();
		System.out.println("초기 용량 :" + v.capacity()); //10
		System.out.println("초기 사이즈 :" + v.size());//0
		System.out.println("=============================");
		//벡터에 데이터를 저장 .add() 사용해서 저장할 수 있다.
		String str = "Test1";
		v.add(str);//index => 0
		Integer num1 = 10;
		v.add(num1);//index => 1
		int num2 = 20;
		
		@SuppressWarnings("unused")
		Integer num3 = num2;//AutoBoxing 
		
		v.add(num2);
		System.out.println("용량 :" + v.capacity());//10
		System.out.println("사이즈 :" + v.size());//2
		System.out.println("=============================");
		//벡터에서 데이터를 인덱스로 출력하기 .get(index)
		System.out.println("데이터 가져오기 :" + v.get(0)); //0번지에 데이터 가져옴
		System.out.println("데이터 가져오기 :" + v.get(1)); // 10 
		System.out.println("데이터 가져오기 :" + v.get(2)); // 20
		//java.lang.ArrayIndexOutOfBoundsException: 
		//System.out.println("데이터 가져오기 :" + v.get(3)); 
		
		for(int i=0; i<9; i++) {
			v.add("Test"+(i+1));
		}
		System.out.println("=============================");
		System.out.println("용량 :" + v.capacity());
		System.out.println("사이즈 :" + v.size());
		System.out.println("첫 인덱스 데이터 가져오기 :" + v.get(0));
		System.out.println("마지막 데이터를 동적으로 가져오기 :"+v.get(v.size()-1));
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex1_Vector ref = new Ex1_Vector();
	}
}





