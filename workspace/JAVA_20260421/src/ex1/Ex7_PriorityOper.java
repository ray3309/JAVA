package ex1;
// 연산자 우선순위
public class Ex7_PriorityOper {
	public static void main(String[] args) {
		int n1 = 1, n2 = 3, n3 = 2;
		int res = n1+n2*n3;
		System.out.println(res);
		
		//() 우선 순위 조정
		int res2 = (n1+n2)*n3;
		System.out.println(res2);
		
	}
}
