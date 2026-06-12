package ex1;

public class Ex2_Switch {

	public static void main(String[] args) throws InterruptedException {

		// Random Number Test
		// (int)((math.random() * 갯수)+시작값)
//		for(int i = 0; i<10; i++)
//		{
//			int times = (int)((Math.random() * 4)+8);
//			System.out.println("[현재 시간:" + times + " 시]");
//		}

		int times = (int) ((Math.random() * 4) + 8);

		do {
			
			switch (times) {
				case 8:
					System.out.println("8시 출근 합니다.");
				case 9:
					System.out.println("9시 출근 합니다.");
				case 10:
					System.out.println("10시 출근 합니다.");		
				case 11:
					System.out.println("10시 출근 합니다.");	
				default:
					System.out.println("쉬는날");
			}			
			Thread.sleep(1000);
		} while (true);
	}

}
