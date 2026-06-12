package ex4;

public class Ex1_MainTeam {
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

	public  void drawSomething() {
		
	}

}
