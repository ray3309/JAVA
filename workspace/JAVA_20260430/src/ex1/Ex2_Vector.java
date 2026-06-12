package ex1;

import java.util.Vector;

public class Ex2_Vector {
	private Vector<Object> v;	// private Vector v 는 Java5 이전 문법으로 Vector<Object> v 로 코드 변경 

	public Ex2_Vector() {
		v = new Vector<Object>();	// new Vector<>() 는 Java5 이전 문법으로 new Vector<Object>() 로 코드 변경
		v.add("Test");
		v.add(10.45f);
		v.add('A');
		v.add(20.11);
		v.add(true);
		v.add(100L);
		System.out.println("사이즈 :" + v.size());
	}
	//Object 자료형으로 저장된 데이터를 instanceof 로 구분하는 방법
	public void printVector() {
		System.out.println("일반 for문으로 출력 한 예:");
		// v.size() =>만약에 Collection의 크기가 커지면 그만큼 Stack이 소모되는 결과 발생한다.
		int vsize = v.size();
		for (int i = 0; i < vsize; i++) {
			System.out.println(i + ":" + v.get(i));
		}
		System.out.println("----------------------");
		@SuppressWarnings("unused")
		String types = "";
		for (Object e : v) {
			if (e instanceof String) {
				types = "String";
				//String에서 제공해주는 메서드를 사용하려면 반드시 String 캐스팅해야 함.
				@SuppressWarnings("unused")
				char cc = ((String) e).charAt(0);
			} else if (e instanceof Float) {
				types = "Float";
			} else if (e instanceof Character) {
				types = "Character";
			} else if (e instanceof Double) {
				types = "Double";
			} else if (e instanceof Boolean) {
				types = "Boolean";
			} else if (e instanceof Long) {
				types = "Long";
			}
		}

	}
	//Class기본객체 제공해주는 메서드와 , String 메서드를 활용해서
	//좀더 간단하게 String의 정보를 얻어오는 방법
	public void printVector2() {
		for(Object e : v) {
			//String res = e.getClass().getName();//java.lang.String
			//String[] resArr = res.split("\\.");
			//System.out.println("Class객체의 메서드 활용:"+resArr[2]);
			//System.out.println(e.getClass().getName().split("\\.")[2]);
			System.out.println(e.getClass().getCanonicalName());
			System.out.println(e.getClass().getPackageName());
			//String indexOf(".") =>.의 앞에서 부터 찾아서 번호를 반환
			System.out.println(e.getClass().getName()+":"+e.getClass().getName().indexOf("."));
			//lastIndexOf => 뒤에서 부터 찾아옴
			System.out.println(e.getClass().getName()+":"+e.getClass().getName().lastIndexOf("."));
			//String substring("문자열",index) => 문자열에서 해당 인덱스부터 문자열을 잘라서 반환 (가위)
			//메서드를 잘 조합하면 아래처럼 필요한 데이터들을 가공할 수 있다. ***** 복습 포인트
			System.out.println("substring사용:"+e.getClass().getName()+":"
					+e.getClass().getName().substring(
							e.getClass().getName().lastIndexOf(".")+1));
		}
	}
	
	public static void main(String[] args) {
		Ex2_Vector ref = new Ex2_Vector();
		//ref.printVector();
		ref.printVector2();
	}
}
