package ex1;
//Stack : JVM에서 메서드, 지역변수 등 실행되고 빠져나가는 공간
//먼저 들어온 자원이 맨 마지막에 나가는 구조 
//스택에 들어갈 자원 - 동전 클래스 
public class Ex2_Coin {
	private int value;

	public Ex2_Coin(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
