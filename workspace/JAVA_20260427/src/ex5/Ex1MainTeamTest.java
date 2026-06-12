package ex5;

// Batch Process 
public class Ex1MainTeamTest {

	public static void main(String[] args) {
		String[] colors = {"빨간색", "노란색", "파란색" };
		Ex1_Rect ref1 		= new Ex1_Rect();
		Ex1_Circle ref2 	= new Ex1_Circle();
		Ex1_Triangle ref3 	= new Ex1_Triangle();
		
		// Array Object Value Init
		Ex1_MainTeam[] arr = {ref1, ref2, ref3};
		
		// Batch
		for(int nLoop = 0; nLoop < arr.length; nLoop++)
		{
			// nLoop = 0 일때 Ex1_Rect 의 색상을 빨간색
			// nLoop = 1 일때 Ex1_Circle 의 색상을 노란색
			
			arr[nLoop].setColor(colors[nLoop]);
			arr[nLoop].drawSomething();
			System.out.println("========================");
		}
	}
}
