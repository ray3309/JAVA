package ex1;

import java.util.ArrayList;
import java.util.Scanner;

//추론)
//회원들의 데이터를 ArrayList에 저장
//회원번호-num,아이디-id,비밀번호-pwd,이름-name,나이-age 
//1,xman,11,테스형,30 =>0
//2,xman2,11,테스형2,32 => 1
//해결방법 => VO객체를 사용해서 ArrayList의 <VO> 즉 전용객체로 생성
public class Ex5GenericArrayList {

	public static void main(String[] args) {
		// MemberVO 회원 1명의 정보를 저장
		// vo주소를 ArrayList에 add로 등록 , 출력
		// step1();
		step2();
	}

	// step1을 Scanner로 입력 시켜보기
	private static void step2() {		
		// 메뉴 만들기 1. 입력 , 2. 출력 , 3 종료
		ArrayList<MemberVO> memList = new ArrayList<>();
		//회원 번호 변수 선언
		int mNum = 1;
		ext:while (true) {
			System.out.println("현재 등록된 인원:"+memList.size());
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
					memList.add(v);//회원 한명을 ArrayList에 저장
					mNum++;
					break;
				case 2:
					for (MemberVO e : memList) {
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

	@SuppressWarnings("unused")
	private static void step1() {
		ArrayList<MemberVO> memList = new ArrayList<>();
		MemberVO v = new MemberVO();
		v.setNum(1);
		v.setId("xman");
		v.setPwd("11");
		v.setName("테스형");
		v.setAge(30);
		memList.add(v);// 회원1 등록
		v = new MemberVO();
		v.setNum(2);
		v.setId("bigdaddy");
		v.setPwd("11");
		v.setName("큰곰");
		v.setAge(32);// 회원2 등록
		memList.add(v);
		System.out.println("회원 등록");
		for (MemberVO e : memList) {
			System.out.println("번호:" + e.getNum());
			System.out.println("ID:" + e.getId());
			System.out.println("이름:" + e.getName());
			if (e.getAge() > 19) {
				System.out.println(e.getAge() + "는 성년");
			} else {
				System.out.println(e.getAge() + "는 미성년");
			}
			System.out.println("-----------------------");
		}

	}
}
