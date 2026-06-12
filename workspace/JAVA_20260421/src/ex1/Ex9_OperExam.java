package ex1;

public class Ex9_OperExam {
	public static void main(String[] args) {
		int a = 10, b = 20;
		
		boolean c = ((a+=12) > b) || (a == (b+2));
		System.out.println("c = "+c);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("-----------");
		a = 10;
		b = 20;
		c = ((a+=12) > b) | (a==(b+=2));	//OR
		System.out.println("c = "+c);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("-----------");				
	}
}
