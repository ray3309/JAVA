package exam;
//사용자로 부터 입력을 받아서 

//스택에 저장하고 순서대로 꺼내서 출력하는 기능을 갖춘 클래스

import java.util.Stack;

public class MyStackDemo {
	// 숫자만 전용으로 저장
	private Stack<Integer> stack;

	public MyStackDemo() {
		stack = new Stack<Integer>();
	}
	//stack의 주소를 접근할 수 있도록 반환 해주는 메서드 
	public Stack<Integer> getStack() {
		return stack;
	}

	// 정수를 하나씩 받아서 멈베의 stack에 저장하는 메서드
	public void addStack(int num) {
		stack.push(num);
		System.out.println("갯수:" + stack.size());
		
	}
	// 스택에 맨위 값을 출력  : peek()
	public int current() {
		return stack.peek();
	}

	public int getMyStack() {
		if (!stack.isEmpty()) {
			return stack.pop();
		} else {
			return 0;
		}
	}

//	public static void main(String[] args) {
//		MyStackDemo ref = new MyStackDemo();
//		Scanner sc = new Scanner(System.in);
//		ext: while (true) {
//			System.out.print("1.입력,2출력,3종료:");
//			int menu = Integer.parseInt(sc.nextLine());
//			switch (menu) {
//			case 1:
//				System.out.print("정수 입력:");
//				int snum = Integer.parseInt(sc.nextLine());
//				ref.addStack(snum);
//				System.out.println("Top:"+ref.current());
//				break;
//			case 2:
//				//------------------------
//				if (!ref.stack.isEmpty()) {
//					System.out.println("스택 전체 출력:");
//					while (!ref.stack.isEmpty()) {
//						System.out.println(ref.getStack());
//					}
//				} else {
//					System.out.println("스택이 비어있습니다.");
//				}
//				//------------------------
//				break;
//			case 3:
//				System.out.println("프로그램 종료");
//				break ext;
//			default:
//				 System.out.println("잘못된 메뉴 선택");
//				break;
//			}
//		}
//	}
}
