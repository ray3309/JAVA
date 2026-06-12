package demo;

public class MyDemo {

	public static void main(String[] args) {
		//추론 해서 메서드 테스트 - 주민번호값을 받아서 성별값을 얻어내고
		//그값을 vo에 저장해서 데이터 베이스에 저장이 가능하다.
		//이런 비지니스 프로그램이 Service에서 구현 해야 한다.
		String ssn = "880811-1";
		String[] ssnArr = ssn.split("-");
		for (String e : ssnArr) {
			System.out.println(e);
		}
		
	}
}
