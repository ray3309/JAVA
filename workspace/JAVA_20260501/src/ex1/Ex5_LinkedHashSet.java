package ex1;

import java.util.Iterator;
import java.util.LinkedHashSet;

//입력순으로 정렬 
public class Ex5_LinkedHashSet {
public static void main(String[] args) {
	LinkedHashSet<String> h3 = new LinkedHashSet<String>();
	h3.add("ZTest");
	h3.add("BTest");
	h3.add("ATest");
	h3.add("CTest");
	h3.add("BTest");// 이미 있으니까 안들어 옴!
	h3.add("KTest");
	System.out.println("------------foreach----------------");
	for(String e : h3) {
		System.out.println(e);
	}
	System.out.println("------------Iterator----------------");
	Iterator<String> it2 = h3.iterator();
	while (it2.hasNext()) {
		String e =  it2.next();
		System.out.println(e);
	}
}
}
