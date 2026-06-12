package ex3.bank;

import ex3.MyException;

public class AccountMain {
public static void main(String[] args) {
	Account account = new Account();
	account.deposit(10000); // 예금 시키기
	long mybalance = account.getBalance();
	System.out.println("예금액 확인:"+mybalance);
	
	//인출 
	try {
		account.withdraw(30000);
	} catch (MyException e) { //사용자 정의 예외를 처리!!
		String message = e.getMessage();
		System.out.println("예외 메세지:"+message);
	}
	
	mybalance = account.getBalance();
	System.out.println("예금액 확인:"+mybalance);
}
}
