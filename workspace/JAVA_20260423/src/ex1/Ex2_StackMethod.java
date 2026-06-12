package ex1;
// Stack = Local Var, Method Call Use
public class Ex2_StackMethod {

	public void TestA() {
		int num = 10;
		TestA(num);
		System.out.println("num1=>" + num);
	}
	
	public void TestA(int num) {
		num += 10;
		System.out.println("num2=>" + num);
	}
	
	public static void main(String[] args) {
		Ex2_StackMethod ref = new Ex2_StackMethod();
		ref.TestA();
	}
}
