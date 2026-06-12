package ex5;

// 추상 클래스(abstract)
// 미완성된 메서드
// abstract 리턴형 메서드명();
// 추상클래스는 반드시 자식에 의해서만 생성/ new로 생성x / super()의해서 생성
// 반드시 상속을 받은 자식 클래스에서 추상 클래스의 메소드를 제정의 해야 한다.
public abstract class Ex1_MainTeam {
	private String color;
	public Ex1_MainTeam() {
		color = "황금색";
	}
	
	public final void setColor(String color) {
		this.color = color;
	}
	
	private String logo() {
		return "⁂⁛¥© ICTAiJava 신촌 1기";
	}

	public final String getColor() {
		return "본사 "+logo()+"의 " + color;
	}

	public abstract void drawSomething();

}
