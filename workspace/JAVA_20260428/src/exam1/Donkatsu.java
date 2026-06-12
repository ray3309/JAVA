package exam1;

public class Donkatsu implements Menu {

	@Override
	public void cook() {
		System.out.println("특재 양념을 사용해서 돈까스를 조리 중입니다.");
	}

	@Override
	public String serve() {
		return "돈까스를 접시에 담고 특재 소스를 곁들여 제공합니다.";
	}

}
