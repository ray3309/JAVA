package ex1;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

//파이썬, 웹에서 응용 
//트리 구조로 위에서 아래로 이진 트리(자식노드는 2개로 분리)
//TreeSet에 객체를 저장하면 부모 노드의 객체와 비교해서 낮은 것은 <왼쪽> 자식 노드에,
//높은 것은 <오른쪽> 자식 노드에 저장
public class Ex4_TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> h1 = new TreeSet<Integer>();
		h1.add(10);
		h1.add(5);
		h1.add(20);
		h1.add(3);
		h1.add(7);
		System.out.println("크기:" + h1.size());
		// 이진트리 구조이기 때문에 오름차순이 보장
		// 10
		// 5 20
		// 3 7
		System.out.println(h1.toString());
		System.out.println("------------foreach----------------");
		// autoboxing : Integer num = 10;
		// unboxing : Integer(Wrapper class) 일반자료형으로 변환
		// int num2 = num;
		for (int e : h1) {
			System.out.print(e+"\t");
		}
		System.out.println();
		System.out.println("------------Iterator----------------");
		Iterator<Integer> it = h1.iterator();
		while (it.hasNext()) {
			int e =  it.next();
			System.out.println(e);
		}
		// 복습및 반드시 기억 -------------------------------------- 
		// 내림차순 정렬을 하기 위해서는 TreeSet으로 객체를 생성한 후에 데이터를 저장 - 오름차순
		// TreeSet에서 descendingSet(); 내림차순으로 정렬한다. 
		// select * from emp order by num asc; ==> 오름차순
		// select * from emp order by num desc; ==> 내림차순 
		// ** -> NavigableSet 내림차순 정렬
		// 조건) 이미 오름차순인 TreeSet이 존재 => h1  => NavigableSet의 변수를 h2 
		System.out.println("-------내림 차순 -----------------");
		NavigableSet<Integer> h2 = h1.descendingSet();
		System.out.println("크기 :"+h2.size());
		System.out.println("첫번째 요소 :"+h2.first());
		System.out.println("마지막 요소 :"+h2.last());
		for (Integer e : h2) {
			System.out.print(e+"\t");
		}
		System.out.println("-------내림 차순 Iterator-----------------");
		Iterator<Integer> itv = h2.iterator();
		while (itv.hasNext()) {
			int e =  itv.next();
			System.out.print(e+"\t");
		}
	}
}







