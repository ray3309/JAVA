package ex1;

public class Ex4_Anonymous {
	@SuppressWarnings("unused")
	private void work() {
		System.out.println("출근 합니다.");
	}
	//추상 클래스는 new 생성 될 수 없고 방금했던 인터페이스 처럼
	//익명 내부클래스로 사용 가능 
	Ex5_Person ref = new Ex5_Person() {
		// 원본에서 없는 메서드를 익명에서 정의 했다 하더라도
	    // 바깥에서 참조할 수 없다. *****
		@SuppressWarnings("unused")
		public void work() {
			System.out.println("익명 내부클래스 출근 합니다.");
		}
		@Override
		public void wake() {
			System.out.println("6시 30분에 기상!");
		}
	};
	public Ex4_Anonymous() {
		ref.wake(); //익명 내부클래스의 메서드 호출
		//work(); //자신의 메서드 호출
		//ref.work();
	}
	public static void main(String[] args) {
		new Ex4_Anonymous();
	}
}
