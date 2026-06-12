package basic;

public class Amain {
	
	public static void main(String[] args) {
		MyA ref = new MyA(10);
		System.out.println(ref.msg());
		
		// 배열로 생성한 후 MyA의 주소를 각각 저장하는 배열로 생성
		MyA[] refMyA = new MyA[3];
		
		refMyA[0] = new MyA(10);
		refMyA[1] = ref;
		refMyA[2] = new MyA(100);
		System.out.println(refMyA[0].msg());
		System.out.println(refMyA[0].n);
		System.out.println(refMyA[1].msg());
		System.out.println(refMyA[1].n);
		System.out.println(refMyA[2].msg());
		System.out.println(refMyA[2].n);
		
		System.out.println(refMyA[0].equals(refMyA[1]));		
		System.out.println(refMyA[0].equals(ref));
		
		for (MyA myA : refMyA) {
			System.out.println(myA);
		}
		
	}

}
