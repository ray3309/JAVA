package ex5;

public class CardPayment implements Payment {

	@Override
	public String pay(int n) {
		// TODO Auto-generated method stub
		return n+"만큼 카드로 결제 했습니다.";
	}

}
