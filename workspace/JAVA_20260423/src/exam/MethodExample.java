package exam;

public class MethodExample {
	
	// 1. 이름을 받아 인사말 반환
	public String hello(String name)
	{
		return "안녕하세요, " + name + "님!";
	}
	
	// 2. 두 수의 합 반환
	public String add(int num1, int num2)
	{
		String Temp;
		Temp = String.format("합: %d", num1+num2);
		return Temp;
	}
	
	// 3. 문자열을 대문자로 변환해 반환
	public String upper(String name)
	{
		return name.toUpperCase();
	}
	
	// 4. 나이를 받아 성인 여부 반환
	public boolean adult(int age)
	{
		return (age > 19)? true : false;
	}
	
	// 5. 반지름을 받아 원의 넓이 반환 Math.PI * r * r
	public double area(double rnum)
	{
		return (Math.PI * rnum * rnum);
	}
	
	// 6. 숫자를 받아 짝수 여부 반환
	public boolean even(int num)
	{
		return (num%2 == 0) ? true : false;
	}
	
	// 7. 문자열 길이 반환
	public int length(String str)
	{
		return str.length();
	}
	
	// 8. 점수를 받아 합격 여부 반환(60점 이상 합격)
	public String pass(int score)
	{
		return (score >= 60) ? "합격" : "불합격";
	}
	// 9. 섭씨를 받아 화씨로 변환해 반환(섭씨 온도 * 2배 + 30)
	public float toF(float fCelsiusNum)
	{
		float FahrenheitNum = ((fCelsiusNum*2)+30L);
		return FahrenheitNum;
	}
	
	// 10. 문자열을 뒤집어 반환 new StringBuilder(text).reverse().toString();
	public String reverse(String str)
	{
		String rStr = new StringBuilder(str).reverse().toString();
		return rStr;
	}
	
	// 14. 두 수 중 큰 값 반환
	public int max(int num1, int num2)
	{
		return (num1>num2) ? num1 : num2;
	}
	
	// 15. 두 수 중 작은 값 반환
	public int min(int num1, int num2)
	{
		return (num1>num2) ? num2 : num1;
	}
	
	public static void main(String[] args) {
		MethodExample ex = new MethodExample();
		
		
		System.out.println(ex.hello("철수"));
		System.out.println("합: " + ex.add(3, 4));
		System.out.println("대문자: " + ex.upper("java"));
		System.out.println("성인 여부: " + ex.adult(20));
		System.out.println("원의 넓이: " + ex.area(5.0));
		System.out.println("짝수 여부: " + ex.even(7));
		System.out.println("글자 수: " + ex.length("안녕하세요"));
		System.out.println("합격 여부: " + ex.pass(55));
		System.out.println("화씨: " + ex.toF(25.0f));
		System.out.println("뒤집기: " + ex.reverse("Hello"));
		System.out.println("큰 값: " + ex.max(8,  12));
		System.out.println("작은 값: " + ex.min(8,  12));
	}
}
