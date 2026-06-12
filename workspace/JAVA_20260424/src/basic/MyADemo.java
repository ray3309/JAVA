package basic;
// MyA를 매개 변수로 받아서 사용
public class MyADemo {
	
	public void useMyA(MyA a) {
		System.out.println("A의 변수:"+a.n);
		
		// 메서드 호출 반환값 지역변수 저장		
		System.out.println("클래스 MyA 의 msg Method 호출 리턴값:"+a.msg());
	}
	
	public static void main(String[] args) {
		// useMyA에게 MyA의 객체 주소를 전달
		MyADemo ref = new MyADemo();
		MyA a = new MyA(200);
		ref.useMyA(a);
	}
	

}
