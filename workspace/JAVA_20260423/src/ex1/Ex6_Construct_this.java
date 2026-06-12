package ex1;

// this() ==> this 호출은 생성자가 오버로딩 되어 있을경우 오버로딩된 생성자 호출 전에 다른 생성자가 먼저 호출되야 할 경우에 사용
// this() 는 오버로딩된 생성자 메소드의 가장 첫 부분에 선언 되어야 한다.

public class Ex6_Construct_this {
	String	model;
	String  color;
	int 	maxSpeed;
	
	public Ex6_Construct_this()	{
		System.out.println("Test");
	}
		
	public Ex6_Construct_this(String model) {
		this();
		this.model = model;
		color = "레드";
		maxSpeed = 1000;
		System.out.println(model+"를 받은 생성자!");
	}
	
	public Ex6_Construct_this(String model, String color) {
		this();
		this.model = model;
		this.color = color;
		
		System.out.println("여기는" + model +"값, " + color + "를 받아서 초기화한 생성자!2");
	}
	
	public Ex6_Construct_this(String model, String color, int maxSpeed) {
		this();
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
		System.out.println("여기는 모델값, 색상, 속도를 받아서 초기화한 생성자!3");
		System.out.println("여기는" + model +", " + color + ", " + maxSpeed + "를 받아서 초기화한 생성자!2");
	}
	
	public String printCar() {
		return model+":"+color+":"+maxSpeed;
	}
	
	public static void main(String[] args) {				
		Ex6_Construct_this ref = new Ex6_Construct_this("마이카");		
		System.out.println(ref.printCar());
		
		
	}
}
