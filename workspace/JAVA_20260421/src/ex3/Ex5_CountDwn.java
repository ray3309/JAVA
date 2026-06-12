package ex3;

public class Ex5_CountDwn {

	public static void main(String[] args) throws InterruptedException {
		
		for(int nLoop = 10; nLoop >= 0; nLoop--)
		{
			System.out.println("CountDown " + nLoop);
			
			//Thread : 프로세스의 최소 단위!!!
			Thread.sleep(1000);
		}		
	}

}
