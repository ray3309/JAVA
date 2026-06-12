package ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//LinkedList와 ArrayList를 각각 생성한 후 
//많은 데이터를 동일하게 저장 하고 속도도 테스트 하는 방법 
public class Ex1LinkedListArrayList {

	public void arrayLinkedList(List<String> ar) {
		long start = System.currentTimeMillis(); // 시작
		for (String e : ar) {
			String msg = e;
			if (msg.equals("ICTPassword01")) {
			}
		}
		long end = System.currentTimeMillis(); // 종료
		System.out.println("소요시간 :" + (end - start));
	}
	//1.LinkedList를 매개변수로 받아서 반복하는 메서드
//	public void linkedList(LinkedList<String> ar) {
//		long start = System.currentTimeMillis();
//		for(String e : ar) {
//			
//			if(e.equals("ICT01")) {
//				
//			}
//		}
//		long end = System.currentTimeMillis();
//		System.out.println("소요시간 :"+(end - start));
//	}
	//2.ArrayList를 매개변수로 받아서 반복하는 메서드
//	public void arrayList(ArrayList<String> ar) {
//		long start = System.currentTimeMillis();
//		for(String e : ar) {
//			
//			if(e.equals("ICT01")) {
//				
//			}
//		}
//		long end = System.currentTimeMillis();
//		System.out.println("소요시간 :"+(end - start));
//	}
	public static void main(String[] args) {
		//객체 생성
		Ex1LinkedListArrayList ref = new Ex1LinkedListArrayList();
		// 더미 데이터를 사용해서 각각의 메서드에게 데이터를 주입
		ArrayList<String> ar1 = new ArrayList<String>();
		LinkedList<String> ar2 = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.print("1-ArrayList, 2-LinkedList :");
		int menu = Integer.parseInt(sc.nextLine());
		// 1억 데이터를 더미로 반복하기 100,000,000 
		if(menu == 1) {
			for(int i=0; i<100000000;i++) {
				if(i % 5 == 0) {
					//ar1에 저장한다는 의미는? ArrayList저장
					ar1.add("ICT01");
				}else {
					ar1.add("Java");
				}
			}
			//생성된 주소로 해당 메서드를 호출하면서 ArrayList를 주입
			ref.arrayLinkedList(ar1);
		}else if(menu == 2) {
			for(int i=0; i<100000000;i++) {
				if(i % 5 == 0) {
					//ar2에 저장한다는 의미는? LinkedList저장
					ar2.add("ICT01");
				}else {
					ar2.add("Java");
				}
			}
			//linkedList 메서드에 LinkedList 주입 
			ref.arrayLinkedList(ar2);
		}
	
		sc.close();
	}
}




