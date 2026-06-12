package ex1;

import java.util.Scanner;

public class Ex6GenericArrayListMain {

	public static void main(String[] args) {
		Ex6GenericArrayList ref = new Ex6GenericArrayList();		
		int mNum = 1;
		ext:while(true) {
			System.out.println("현재 등록된 인원:"+ref.getTotal());
			try(Scanner sc = new Scanner(System.in);) {
				System.out.print("1. 입력 , 2. 출력 , 3 종료 :");
				int menu = Integer.parseInt(sc.nextLine());
				switch (menu) {
				case 1:
					//입력처리
					MemberVO v = new MemberVO();//회원 한명의 데이터를 저장
					v.setNum(mNum);
					System.out.print("id:");
					v.setId(sc.nextLine());
					System.out.print("pwd:");
					v.setPwd(sc.nextLine());
					System.out.print("name:");
					v.setName(sc.nextLine());
					System.out.print("age:");
					v.setAge(Integer.parseInt(sc.nextLine()));
					ref.addMember(v);
					mNum++;
					break;
				case 2:
					for (MemberVO e : ref.getMemList()) {
						System.out.println("id:"+e.getId());
						System.out.println("name:"+e.getName());
						System.out.println("age:"+e.getAge());
						System.out.println("---------------------");
					}
					break;
				case 3:
					System.out.println("회원 프로그램을 종료 합니다.");
					break ext;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("메뉴는 숫자로 입력하세요!");
			}
		}
	}
}
