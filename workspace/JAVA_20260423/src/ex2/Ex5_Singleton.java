package ex2;

public class Ex5_Singleton {

	private static Ex5_Singleton singleRef;
		
	private Ex5_Singleton() { System.out.println("생성자가 호출이 됨!!!!");}
	
	public static synchronized Ex5_Singleton getInstance() {
		if(null == singleRef){
			singleRef = new Ex5_Singleton();
		}
		return singleRef;
	}
}
