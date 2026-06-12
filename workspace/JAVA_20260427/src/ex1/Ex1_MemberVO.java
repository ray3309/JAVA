package ex1;

public class Ex1_MemberVO {
	private int num;
	private String name;
	private String id;
	private String pwd;
	private int age;
	private String rdate;
	
	public Ex1_MemberVO(){
		num = 0;
		name = "";
		id = "";
		pwd = "";
		age = 0;
		rdate = "1900-01-01 00:00:00";
	}

	public Ex1_MemberVO(int num, String name, String id, String pwd, int age, String rdate) {
		//super();
		this.num = num;
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.age = age;
		this.rdate = rdate;
	}

	// getter / setter Method
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}	
}
