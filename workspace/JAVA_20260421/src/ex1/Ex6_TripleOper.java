package ex1;

public class Ex6_TripleOper {

	public static void main(String[] args) {
		
		String msg = "ICTAI자바애플리케이션";
		
		System.out.println(msg);
		System.out.println("문자열의 길이(length)" + msg.length());
		
		char cc = msg.charAt(0);
		System.out.println("한문자만 반환하는 메서드 charAt(idx) : " + cc);
		
		// Triple Operator
		// Condition ? (True=>실행식1):(False=>실행식2)
		String res = (cc == 'I') ? cc + "별":cc+"하트";
		System.out.println(res);
		int res2 = (cc == 'I') ? 100 : 50;
		System.out.println(res2);
		
		boolean bRet = false;	
		String nStr = (bRet == true) ? "좋아요" : "싫어요";
		System.out.println(nStr);
	}
}
