package front;

import java.util.List;
import java.util.Scanner;

import service.MyServiceImple;
import service.MyServiceInter;
import vo.MyDataVO;

public class MyFront {

	private Scanner sc;
	private MyServiceInter myInter;
	public MyFront() {
		sc = new Scanner(System.in);
		myInter = new MyServiceImple();
	}
	public void startApp() {
		//사용자로 부터 입력받은 값을 VO넣어서 서비스의 메서드에게 전달 하거나
		//List로 돌려받아서 출력 
		ext:while (true) {
			System.out.print("1.작성 , 2. 리스트 , 3.종료 :");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				MyDataVO v = new MyDataVO();//정보 1개당 객체 1
				System.out.print("이름:");
				v.setName(sc.nextLine());
				System.out.print("이메일:");
				v.setEmail(sc.nextLine());
				System.out.print("주민번호:");
				v.setSsn(sc.nextLine());
				System.out.print("나이:");
				v.setAge(Integer.parseInt(sc.nextLine()));
				//Front -> Service -> Dao -> DB => insert
				myInter.addData(v);
				break;
			case 2:
				//Front <- Service <- Dao <- DB => select
				List<MyDataVO> mlist = myInter.getListData();
				for (MyDataVO e : mlist) {
					System.out.println("번호:"+e.getNum());
					System.out.println("이름:"+e.getName());
					System.out.println("이메일:"+e.getEmail());
					System.out.println("날짜:"+e.getMdate());
					System.out.println("--------------------------");
				}
				break;
			case 3:
				System.out.println("종료");
				break ext;	
			default:
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		MyFront ref = new MyFront();
		ref.startApp();
	}
}
