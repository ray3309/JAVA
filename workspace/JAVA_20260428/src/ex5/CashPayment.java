package ex5;

public class CashPayment implements Payment {

	@Override
	public String pay(int n) {
		// TODO Auto-generated method stub
		return n+"만큼 현금으로 결제 했습니다.";
	}

}
