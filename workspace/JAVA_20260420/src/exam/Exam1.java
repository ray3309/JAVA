package exam;
public class Exam1 {
	public static void main(String[] args) {
		String myName = "테스형"; 	// 이름(문자열) 이기 때문에 String 형을 사용
		int myAge = 30; 			// 정수형 연산은 기본적으로 int로 사용하기 때문에 int 사용
		int manAge = myAge - 1;		// 정수형 연산은 기본적으로 int로 사용하기 때문에 int 사용
		float h = 182.3f; 			// 키는 소수점 한자리 까지 나오기에 float 으로 사용하고 상수 뒤에 f를 붙여줌
									// f를 안붙일 경우 double로 처리 되기 때문
		
		String local = "서울"; 		// 문자열은 String으로 사용
		char name1, name2, name3;
		name1 = myName.charAt(0);	// String 클래스 내부에 charAt이라는 메소드가 정의가 되어있어서 String의 Index를 가지고 해당 캐릭터를 추출
		name2 = myName.charAt(1);	// String 클래스 내부에 charAt이라는 메소드가 정의가 되어있어서 String의 Index를 가지고 해당 캐릭터를 추출
		name3 = myName.charAt(2);	// String 클래스 내부에 charAt이라는 메소드가 정의가 되어있어서 String의 Index를 가지고 해당 캐릭터를 추출

		System.out.println("===== My Profile =====");
		System.out.println("이름:[" + myName + "]");
		System.out.println("나이:[" + myAge + "]");
		System.out.println("만나이:[" + manAge + "]");
		System.out.println("키:[" + h + "]");
		System.out.println("사는곳:[" + local + "]");

		System.out.println("성:[" + name1 + "]");
		System.out.println("이름:[" + name2 + name3 + "]");

		// 동의 여부 출력
		Boolean fg = false; // true 또는 false
		if (fg) {
			System.out.println("동의했습니다!");
		}
		else{
			System.out.println("미동의했습니다!");
		}
	}
}