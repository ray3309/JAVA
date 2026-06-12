package ex1;

import java.io.Serializable;

//Pojo CLASS
public class MemberVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 904734916594251939L;
	private int num;
	transient private String pass;	// transient 키워드를 붙이면 해당 필드는 직열화에서 제외 시킴
	private String name;
	private boolean agree;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAgree() {
		return agree;
	}
	public void setAgree(boolean agree) {
		this.agree = agree;
	}
	

}
