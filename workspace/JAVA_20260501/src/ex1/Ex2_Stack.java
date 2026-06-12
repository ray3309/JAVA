package ex1;

import java.util.Stack;

//Stack이라는 자료 구조에 동전들을 넣기 위해서 선언하고 생성 
//Stack에 Conin객체를 생성해서 하나씩 차곡 차곡 아래부터 저장
//Stack은 먼저 들어간 값이 나중에 나오는 동전 지갑과 같은 구조
public class Ex2_Stack {
	public static void main(String[] args) throws InterruptedException {
		// Coin객체만 담을 수 있는 Stack을 생성
		Stack<Ex2_Coin> ref = new Stack<Ex2_Coin>();
		System.out.println("스택 비워져 있는 유무 1 :" + ref.isEmpty()); // true
		// push() 스택에 순서대로 저장하기
		ref.push(new Ex2_Coin(100));// 100원짜리 동전을 첫번째 스택에 저장
		ref.push(new Ex2_Coin(50));
		ref.push(new Ex2_Coin(500));
		ref.push(new Ex2_Coin(10));
		ref.push(new Ex2_Coin(100));
		System.out.println("용량:" + ref.capacity());
		System.out.println("갯수 :" + ref.size());
		System.out.println("스택 비워져 있는 유무 1 :" + ref.isEmpty()); // false
		System.out.println("==============================");
		// pop() 스택에서 순서대로(넣었을 때 반대방향) 꺼내 면서 스택에서 제거한다.
		// while문 동작방식
		// 비워져 있지 않으면 => false => !부정
		// while(!ref.isEmpty()) {
		// pop()
		// }
//		System.out.println("while True :=>"+!ref.isEmpty());
//		System.out.println(ref.pop().getValue());
//		System.out.println("갯수 :"+ref.size());
//		System.out.println("------------------------------");
//		System.out.println("while True :=>"+!ref.isEmpty());
//		System.out.println(ref.pop().getValue());
//		System.out.println("갯수 :"+ref.size());
		while(!ref.isEmpty()) {
			Thread.sleep(1000);
			System.out.println(ref.pop().getValue());
			System.out.println("갯수 :"+ref.size());
			System.out.println("==========================");
		}
		System.out.println("남은 갯수 :"+ref.size()); //0
	}
}





