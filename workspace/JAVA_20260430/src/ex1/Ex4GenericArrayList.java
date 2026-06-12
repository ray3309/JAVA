package ex1;

//*****
//ArrayList : 나머지는 벡터와 별반 차이가 없고, 동기화를 지원하지 않는다.(우수)
//Generic:JDK5부터 지원 됨, Collection의 캐스팅 방지를 위해서
//전용객체로 만들자.
import java.util.ArrayList;

public class Ex4GenericArrayList {

	private ArrayList<String> v1;
	private ArrayList<Integer> v2;

	// 1) 정수 숫자 아무거나 5개 저장하는 ArrayList를 선언하고
	public  Ex4GenericArrayList() {
		v1 = new ArrayList<>();
		v1.add("Test1");
		v1.add("100");
		v1.add("Test1");
		int num = 1000;
		v1.add(String.valueOf(num));
		System.out.println("ArrayList size =>" + v1.size());
		System.out.println("-----------------");
		// 2) 생성 후 값을 저장 한 후에 size 출력해보기
		v2 = new ArrayList<>();
		v2.add(100);
		String num2 = "100"; // 문자열 정수를 v2 에 저장하기 위해서는
		// 어떻게든 정수로 변경해서 넣어야 한다.
		v2.add(Integer.parseInt(num2));
		for (Integer e : v2) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex4GenericArrayList ref = new Ex4GenericArrayList();
	}

}
