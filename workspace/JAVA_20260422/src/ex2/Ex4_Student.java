package ex2;

public class Ex4_Student {

	// @SuppressWarnings("unused")
	private int num;
	// @SuppressWarnings("unused")
	private String name;
	// @SuppressWarnings("unused")
	private int age;
	// @SuppressWarnings("unused")
	private String addr;
	
	public static void main(String[] args) {
		Ex4_Student ref = new Ex4_Student();

		ref.addStudent(1, "테스형", 30, "신촌");

		System.out.println("출력");

		String res = ref.printStudent();
		System.out.println(res);
	}

	// main에서 호출을 가정!!!
	// String res = ref.printStudent();
	public String printStudent() {		
		return String.format("번호 : %d, 이름 : %s, 나이 : %d, 주소 : %s", num, name, age, addr);
	}

	public void addStudent(int snum, String sname, int sage, String saddr) {
		
		num = snum;
		name = sname;
		age = sage;
		addr = saddr;
		
		System.out.println("Check argument : [snum = " + snum + "], [sname = " + sname + "], [sage = " + sage
				+ "], [ saddr = " + saddr + "]");

		System.out.println("Before num = " + num);

		num = snum;

		System.out.println("After num = " + num);
		
		System.out.println("");
	}
}
