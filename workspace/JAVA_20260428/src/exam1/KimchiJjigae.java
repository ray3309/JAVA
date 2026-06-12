package exam1;

public class KimchiJjigae implements Menu {

	@Override
	public void cook() {
		System.out.println("특재 양념을 사용해서 김치찌개를 끓입니다.");
	}

	@Override
	public String serve() {

		return "김치찌개를 뚝배기에 담아 제공합니다.";
	}

}
