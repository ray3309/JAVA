package exam;

public class Waffle {
	private String name;	// 와플 이름
	private String topping;	// 토핑
	private int price;		// 가격
	
	// Default Constructor
	public Waffle() {
		this.name = "기본 와플";
		this.topping = "없음";
		this.price = 2000;		
	}
	
	// 이름만 지정하는 생성자
	public Waffle(String name)
	{
		this();
		this.name = name;
		this.topping = "없음";
		price = 3000;
	}
	
	// 이름과 토핑을 지정하는 생성자
	public Waffle(String name, String topping)
	{
		this();
		this.name = name;
		this.topping = topping;
		price = 4000;
	}
	
	// 이름, 토핑, 가격 모두 지정하는 생성자
	public Waffle(String name, String topping, int price)
	{
		this();
		this.name = name;
		this.topping = topping;
		this.price = price;
	}
	
	// 와플 정보 반환 메서드
	public String info() {
		String OutMsg = String.format("와플 종류: %s, 토핑: %s, 가격: %d", name, topping, price);
		return  OutMsg;
	}
	
	// 메인 메서드에서 테스트
	public static void main(String[] args) {
		// 기본 와플
		Waffle basic = new Waffle();
		
		// 크림와플(이름만 지정)
		Waffle cream = new Waffle("크림와플");
		
		//피자와플(이름 + 토핑 지정)
		Waffle pizza = new Waffle("피자와플", "치즈+페페로니");
		
		//특수와플(이름 + 토핑 + 가격 지정)
		Waffle deluxe = new Waffle("딸기크림와플", "딸기+생크림", 5500);
		
		//출력
		System.out.println(basic.info());
		System.out.println(cream.info());
		System.out.println(pizza.info());
		System.out.println(deluxe.info());
	}
}
