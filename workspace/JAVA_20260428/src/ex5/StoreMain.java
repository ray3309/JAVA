package ex5;

import java.util.Scanner;

public class StoreMain {
	 // Payment 인터페이스를 매개변수로 받음 -> 다형성 구현
	//case 1 => Payment payment = new CardPayment()
	//case 2 => Payment payment = new CashPayment()
	public void processPayment(Payment payment, int n) {
		//instanceof
		if (payment instanceof CardPayment){
			System.out.println("결재 방식이 카드 입니다.");
		}else if(payment instanceof MobilePayment){
			System.out.println("WIFI/LTE를 통해서 결재가 진행됩니다.");
		}else if(payment instanceof CashPayment){
			System.out.println("현금 영수증은 필수 에요!");
		}
		System.out.println(payment.pay(n));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StoreMain ref = new StoreMain();
		ext:while(true) {
			System.out.print("1.카드,2.현금,3.모바일,다른숫자 종료:");
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				ref.processPayment(new CardPayment(), 50000);
				break;
			case 2:
				ref.processPayment(new CashPayment(), 30000);
				break;
			case 3:
				ref.processPayment(new MobilePayment(), 15000);
				break;

			default:
				System.out.println("수고하셨습니다. 결재를 마칩니다.!");
				break ext;
			}
		}
		
		//다양한 결제 방식도 하나의 메서드로 처리 할 수 있다. *****
		//ref.processPayment(new CardPayment(), 50000);
		//ref.processPayment(new CashPayment(), 30000);
		//ref.processPayment(new MobilePayment(), 15000);
		
		sc.close();
	}
}
