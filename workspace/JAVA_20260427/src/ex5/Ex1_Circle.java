package ex5;

//Abstract 

public class Ex1_Circle extends Ex1_MainTeam {

	@Override
	public void drawSomething() {
		System.out.println("Circle팀이 [" + getColor() + "] 원형을 제작했습니다.");
	}
}
