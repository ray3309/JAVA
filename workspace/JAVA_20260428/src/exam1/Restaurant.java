package exam1;

import java.util.Scanner;

public class Restaurant {

	private Menu menu;
	public Restaurant(String  request) {
		switch (request) {
		 case "된장찌개":
			 menu = new DoenjangJjigae();
			break;
		 case "김치찌개":
			 menu = new KimchiJjigae();
			break;
		 case "돈까스":
             menu = new Donkatsu();
             break;
         default:
             System.out.println("해당 메뉴는 준비되지 않았습니다.");
		}
	}
	public String execService() {
		return menu.serve();
	}
	public static void main(String[] args) throws InterruptedException {
		Restaurant rt;
		Scanner sc = new Scanner(System.in);
		System.out.print("주문하시려면 1번!");
		int order = Integer.parseInt(sc.nextLine());
		if(order == 1) {
			System.out.println("1.주문 : 된장찌개 , 김치찌개 , 돈까스 라고 말해주세욧");
			String menu = sc.nextLine();
			rt = new Restaurant(menu);
			System.out.println("정확히 3초 이후 음식이 나옵니다.");
			Thread.sleep(3000);
			System.out.println("주문하신 "+menu+"가 나왔어욧 맛나게 드세요.");
			System.out.println("주문결과");
			System.out.println(rt.execService());
		}
		
		sc.close();
	}
}
