package ex3;
//POJO(Plain Old Java Object) --> Pure Java Class, Inheritance, Business Logic not include
//                                Only have a Pure Value Object
// 모든 값은 private -> 정보은닉
// 값에 접근 할수 있는 방법 -> set/(get or (is = boolean))
// 
public class Member {
	private int    age;
	private String Id;
	private String name;
	private String pwd;
	private boolean agree;
	private String etc;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public boolean isAgree() {
		return agree;
	}
	public void setAgree(boolean agree) {
		this.agree = agree;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	} 
}
