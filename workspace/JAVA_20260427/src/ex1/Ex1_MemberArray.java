package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex1_MemberArray {

	public static void main(String[] args) {
		Ex1_MemberVO[] members = new Ex1_MemberVO[3];
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String today = f.format(new Date());
		
		members[0] = new Ex1_MemberVO(1, "테스형", "xman", "test1", 13, today );
		members[1] = new Ex1_MemberVO(2, "고형", "go", "test1", 13, today );
		members[2] = new Ex1_MemberVO(3, "고패스", "gopass", "test1", 13, today );
		
		for(Ex1_MemberVO e : members){
			System.out.println("번호:" + e.getNum());
			System.out.println("이름:" + e.getName());
			System.out.println("나이:" + e.getAge());
			System.out.println("--------------------");
		}
		
		members[0].setName("희상");
		
		for(Ex1_MemberVO e : members){
			System.out.println("번호:" + e.getNum());
			System.out.println("이름:" + e.getName());
			System.out.println("나이:" + e.getAge());
			System.out.println("--------------------");
		}
	
	}	
}
