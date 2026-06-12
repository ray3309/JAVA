package exam1;

public class DoenjangJjigae implements Menu {

	@Override
	public void cook() {
		 System.out.println("특재 양념을 사용해서 된장찌개를 끓입니다.");
	}

	@Override
	public String serve() {
		return "맛있는 된장 찌개를 뚝배기에 담아서 제공합니다.";
		
	}

}
