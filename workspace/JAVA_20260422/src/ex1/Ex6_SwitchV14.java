package ex1;

public class Ex6_SwitchV14 {

	public static void main(String[] args) {
		int num = 95;
		
		// result save var declare
		String res;		
		switch (num/10)
		{
		case 9, 10:
			res = "A학점";
			break;
		case 8:
			res = "B학점";
			break;
		case 7:
			res = "C학점";
			break;
		case 6:
			res = "D학점";
			break;		
		default:
			res = "F학점";
		}

		System.out.println("[switch일반] " + num + " 점수의 학점 => " + res);
		System.out.println("============================");
		
		num = 80;
		// switch labeled type
		res = switch(num/10)
		{
		case 10, 9 -> { if(num>=95){yield "A+학점";} else{ yield "A학점";}}
		case 8, 7 -> { yield res = (num >= 85) ? "B+학점" : "B학점";}
		case 6 -> "C학점";
		case 5 -> "D학점";		
		default -> "F학점";
		};
		
		System.out.println("[switch축약형] " + num + " 점수의 학점 => " + res);
		System.out.println("============================");
	}

}
