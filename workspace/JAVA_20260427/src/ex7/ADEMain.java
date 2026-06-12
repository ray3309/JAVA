package ex7;

public class ADEMain {
	public static void main(String[] args) {
		// 메모리 구조를 Heap을 그려보기
		@SuppressWarnings("unused")
		D d = new D("type1");
		System.out.println("=========================");		
		@SuppressWarnings("unused")
		E c = new E("type2");
		
		A ref = new D("type1");
		A ref1 = new E("type2");		
		System.out.println("==========================");
		
		ref.testA();
		ref1.testA();
		
		// A-B-D => 0x100 = ref
		// A-C-E => 0x200 = ref1
		
		System.out.println("new D()에 해당되는 instanceof");
		System.out.println("A ref intanceof 자료형 :" + (ref instanceof A));
		System.out.println("A ref intanceof 자료형 :" + (ref instanceof B));
		System.out.println("A ref intanceof 자료형 :" + (ref instanceof D));
		
		System.out.println("A ref intanceof 자료형 :" + (ref instanceof E));	// false
		System.out.println("==========================");
		
		B ref2 = new D("type2");
		System.out.println("B ref2 intanceof 자료형 :" + (ref2 instanceof A));
		System.out.println("B ref2 intanceof 자료형 :" + (ref2 instanceof B));
		System.out.println("B ref2 intanceof 자료형 :" + (ref2 instanceof D));	
	}


}
