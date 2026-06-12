package exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Bank {

	// Variable Section
	private String AccountNo; // 게좌번호

	private long Deposit_Money; // 입금 금액
	private long Withdraw_Money; // 출금 금액
	private long Total_Money; // 계좌(총) 잔액

	private String Withdraw_Date; // 출금 날짜
	private String Deposit_Date; // 입금 날짜

	private String Password; // 계좌비밀번호
	private String Name; // 예금주(이름)

	private boolean bRet = false; // 계좌 폐쇄 유무

	private Date dtCurrentDate;
	private SimpleDateFormat Dateformat;

	// Method Section
	Bank() {
		dtCurrentDate = new Date();
		Dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	}

	// 계좌번호 추출 생성을 위한 헬퍼 유틸리티 함수제작(Random() 사용)
	private static String generatePattern() {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();

		// Helper to append 'n' random digits
		appendRandomDigits(sb, random, 3);
		sb.append("-");
		appendRandomDigits(sb, random, 7);
		sb.append("-");
		appendRandomDigits(sb, random, 2);

		return sb.toString();
	}

	// 계좌번호 추출 생성을 위한 헬퍼 유틸리티 함수제작(Random() 사용)
	private static void appendRandomDigits(StringBuilder sb, Random random, int count) {
		for (int i = 0; i < count; i++) {
			sb.append(random.nextInt(10)); // Generates 0-9
		}
	}

	// 계좌 개설
	public String OpenAccount(String sName, String sPassword) {
		System.out.println("계좌계설");

		setName(sName);
		setPassword(sPassword);
		setAccount(generatePattern()); // 계좌 123-4567890-21
		System.out.println(AccountNo);

		return AccountNo;
	}

	// 계좌 폐쇄
	public boolean CloseAccount(String sAccountNo, String sName, String sPassword) {
		if (AccountNo.equals(sAccountNo) == true && sName.equals(Name) == true && sPassword.equals(sPassword) == true) {
			// 맞는 계좌가 있기 때문에 해당 계좌의 번호를 "" 로 초기화
			setAccount("");
			setName("");
			setPassword("");

			bRet = true;

			System.out.println("해당 계좌가 정상적으로 폐쇄 되었습니다.");
		} else {
			System.out.println("계좌를 찾을수 없습니다.");
			bRet = false;
		}
		return bRet;
	}

	// 입금
	public long Deposit(String sAccountNo, String sPassword, long lDeposit_Money) {
		if (AccountNo.equals(sAccountNo) == true && Password.equals(sPassword) == true) {
			// 입금 가능
			setDepositMoney(lDeposit_Money);
			Total_Money += getDepositMoney();

			setDeposit_Date(Dateformat.format(dtCurrentDate));

			System.out.println(getName() + " 고객님의 계좌번호 : " + getAccount() + ", 입금 금액 : " + getDepositMoney() + ", 입금후 잔액 : " + getTotalMoney() + ", 입금날짜 : " + getDeposit_Date());
		} else if (AccountNo.equals(sAccountNo) == false) {
			// 입금 불가
			System.out.println("계좌번호가 맞지 않아 입금 불가");
		} else if (AccountNo.equals(sAccountNo) == true && Password.equals(sPassword) == false) {
			// 입금 불가
			System.out.println("계좌의 비밀번호가 맞지 않아 입금 불가");
		}

		return getTotalMoney();
	}

	// 출금
	public long Withdraw(String sAccountNo, String sPassword, long lWithdraw_Money) {
		if (AccountNo.equals(sAccountNo) == true && Password.equals(sPassword)) {
			// 출금 가능
			setWithdrawMoney(lWithdraw_Money);
			Total_Money -= getWithdrawMoney();

			setWithdraw_Date(Dateformat.format(dtCurrentDate));
			System.out.println(getName() + " 고객님의 계좌번호 : " + getAccount() + ", 출금 금액 : " + getWithdrawMoney() + ", 출금후 잔액 : "
					+ getTotalMoney() + "출금날짜 : " + getWithdraw_Date());

		} else if (AccountNo.equals(sAccountNo) == false) {
			// 출금 불가
			System.out.println("계좌번호가 맞지 않아 출금 불가");
		} else if (AccountNo.equals(sAccountNo) == true && Password.equals(sPassword) == false) {
			// 출금 불가
			System.out.println("계좌의 비밀번호가 맞지 않아 출금 불가");
		}

		return getTotalMoney();
	}

	// 잔액조회
	public long CheckBalance(String sAccountNo, String sPassword) {
		if (AccountNo.equals(sAccountNo) == false) {
			// 잔액조회 불가
			System.out.println("계좌번호가 맞지 않아 잔액조회 불가");
		} else if (AccountNo.equals(sAccountNo) == true && Password.equals(sPassword) == false) {
			// 잔액조회 불가
			System.out.println("계좌의 비밀번호가 맞지 않아 잔액조회 불가");
		} else {
			System.out.println(getName() + " 고객님의 계좌번호 : " + getAccount() + " 의 잔액은 " + getTotalMoney() + "원 입니다.");
		}

		return getTotalMoney();
	}

	// getter Method
	private String getAccount() {
		return AccountNo;
	}

	private String getName() {
		return Name;
	}

	private long getDepositMoney() {
		return Deposit_Money;
	}

	private long getWithdrawMoney() {
		return Withdraw_Money;
	}

	private long getTotalMoney() {
		return Total_Money;
	}

	private String getDeposit_Date() {
		return Deposit_Date;
	}

	private String getWithdraw_Date() {
		return Withdraw_Date;
	}

	// setter Method
	private void setAccount(String sAccountNo) {
		AccountNo = sAccountNo;
	}

	private void setName(String sName) {
		Name = sName;
	}
	
	private void setPassword(String sPassword)	{
		Password = sPassword;
	}

	private void setDepositMoney(long lDepositMoney) {
		Deposit_Money = lDepositMoney;
	}

	private void setWithdrawMoney(long lWithdrawMoney) {
		Withdraw_Money = lWithdrawMoney;
	}

	private void setDeposit_Date(String sDeposit_Date) {
		Deposit_Date = sDeposit_Date;
	}

	private void setWithdraw_Date(String withdraw_Date) {
		Withdraw_Date = withdraw_Date;
	}
}
