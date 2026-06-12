package ex1;

//main Method는 Static영역에 저장(main은 static 메소드)
//String str = new String("Test"); 
// ==> String str 은 Stack영역에 저장, new String 클래스는 heap영역에 저장 하고 "Test" 문자열은 상수풀에 저장

public class Ex4_StringRefOper {

	public static void main(String[] args) {
		String str1 = new String("Test");
		String str2 = new String("Test");
		
		System.out.println("str1 메모리 번지 : 0x" + System.identityHashCode(str1));
		System.out.println("str2 메모리 번지 : 0x" + System.identityHashCode(str2));		
		
		// 객체간 메모리 주소값 비교
		System.out.println("str1 == str2 : " + (str1 == str2));
		
		// 객체의 내용 비교는 .equals() 호출로 비교
		System.out.println("str1 == str2 : " + str1.equals(str2));
		System.out.println("str1 == str2 : " + str1.equals("Test"));
		
		// 묵시적 - 내용이 같으면 "Test2"란 값을 가지는 객체 한번만 생성이 되고, 이후는 Test2 객체를 묵시적으로 생성하려면 기존의 주소를 공유		
		str2 = str1;
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		String msg2 = "Test2";
		String msg3 = "Test2";
		System.out.println(msg2 == msg3);
		
		if(msg2 == msg3)
		{
			System.out.println(msg2+"는 같다");
		}
		else
		{
			System.out.println(msg2+"는 다르다");
		}		
	}

}
