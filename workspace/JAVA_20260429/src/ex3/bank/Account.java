package ex3.bank;

import ex3.MyException;

public class Account {
	private long balance; // 잔액

	public Account() {
	}

	public long getBalance() { // 잔액을 출력
		return balance;
	}

	public void deposit(int money) { // 예금
		balance += money;
	}

	public void withdraw(int money) throws MyException {
		if (balance < money) {
			// System.out.println("잔고 부족 :"+(money - balance)+"부족함");
			// 처리하고 싶은 부분에서 내가 만든 예외를 발생 한다.
			// 우리가 만든 사용자 정의 예외를 생성해서 강제 발생 시킴
			// throw 발생할 예외를 생성
			throw new MyException("잔고 부족 :"+(money - balance)+"부족함");
		}
		balance -= money;
	}
}



