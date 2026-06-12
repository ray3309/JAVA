package ex2;

public class Ex5_Singleton_Main {
	public static void main(String[] args) {
		
		Ex5_Singleton inst1 = Ex5_Singleton.getInstance();
		Ex5_Singleton inst2 = Ex5_Singleton.getInstance();
		Ex5_Singleton inst3 = Ex5_Singleton.getInstance();
		
		System.out.println(inst1);
		System.out.println(inst2);
		System.out.println(inst3);
		
		System.out.println(inst1 == inst2);
		System.out.println(inst2 == inst3);
		System.out.println(inst3 == inst1);
	}
}
