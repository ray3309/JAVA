package ex1;
// Ref 자료형 배열 : 배열 요소의 값에 생성된 객체의 주소를 저장
public class Ex4_RefArray {

	public static void main(String[] args) {
		// 
		String[] str1 = {"Test1", "Xest2", "Test1"};		
		//System.out.println(str1[0].equals(str1[2]));

		for (String e : str1) {
			
			System.out.println(e);
			
			// 첫글자만
			System.out.println(e.charAt(0));
			
			// T 시작하면 true
			System.out.println(e+":"+e.startsWith("T"));
			
			System.out.println("--------------------------------");
		}
		
		System.out.println("배열 생성 방법2");
		String[] str2 = new String[3];
		str2[0] = "Test1";
		str2[1] = "Test1";
		str2[2] = "Test1";
		
		for (String e : str2) {
			System.out.println(e+":"+e.startsWith("T"));
		}
		System.out.println(str2[1] == str2[2]);
	}

}
