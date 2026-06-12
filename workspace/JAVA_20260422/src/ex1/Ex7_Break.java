package ex1;

public class Ex7_Break {

	public static void main(String[] args) {
		int n = 7;
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);
			if(i == n)
			{
				break;
			}
			System.out.println("*****"+i);
			
		}

	}

}
