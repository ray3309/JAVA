package ex3;

import java.util.Scanner;

// Has a 관계
// A -> B 참조 관계


public class Ex1_MemberFront {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Member vo = new Member();
		
		System.out.println("ID 입력 : ");
		vo.setId(sc.nextLine());
		System.out.println("나이 입력 : ");
		vo.setAge(Integer.parseInt(sc.nextLine()));
		System.out.println("이름 입력 : ");
		vo.setName(sc.nextLine());
		
		Ex1MemberModel1 model = new Ex1MemberModel1();
		model.addMember(vo);
		System.out.println("---------------");
		model.printMember();

		sc.close();
	}

}
