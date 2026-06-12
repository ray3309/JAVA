package ex1;

import java.util.HashSet;
import java.util.Iterator;

//Set 컬렉션은 저장 순서가 유지되지 않음
//객체를 중복해서 저장할 수 없고, 하나의 null만 저장할 수 있음 *****
//HashSet : 주소가 같은 객체를 중복 저장하지 않음
//원리) 다른 객체라도 hashCode() 메소드의 리턴값이 같고,
//equals() 메소드가 true를 리턴하면 이것은 값이 같다고 보고 중복을 저장 안함.
//Set인터페이스 - HashSet 정렬이 보장되지 않는 중복값을 방지하는 컬렉션
public class Ex3_HashSet {
public static void main(String[] args) {
	//Set<E>
	HashSet<String> h1 = new HashSet<>();
	h1.add("ZTest");
	h1.add("BTest");
	h1.add("ATest");
	h1.add("CTest");
	h1.add("BTest");//중복
	h1.add("KTest");
	h1.add("KTest");//중복
	h1.add("KTest");//중복
	System.out.println("크기 :"+h1.size());
	System.out.println(h1.toString());
	System.out.println("----------------------------");
	//Collection 인터페이스를 구현한 클래스들은 모두 반복자 Iterator 제공해준다.
	/*
	* 	             Collection 
	*                    |
	*  List                                  Set 
	*    |                                     |
	*  Vectory  ArrayList LinkedList        HashSet TreeSet
	*    |
	*  Stack
	* */
	for (String e : h1) {
		System.out.println(e+":"+e.charAt(0));
	}
	System.out.println("----------------------------");
	Iterator<String> it = h1.iterator();
	//hasNext() : 해당 Collection에서 h1 반복할 데이터가 있으면 true
	while (it.hasNext()) {
		String e =  it.next();
		System.out.println(e+":"+e.charAt(0));
		
	}
	
	
}
}



