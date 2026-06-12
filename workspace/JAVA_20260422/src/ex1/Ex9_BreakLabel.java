package ex1;

public class Ex9_BreakLabel {

	public static void main(String[] args) {
		ext:for(int i=1; i<=9; i++)
		{
			for(int j=2; j<=9; j++)
			{
				if(j==6)
					break ext;
				
				System.out.println(j+"x"+i+"\t");
			}
			System.out.println("");			
		}

	}

}
