package exam;

public class Exam2{
	public static void main(String[] args) {
		String title = "명량";
		int year = 2014;
		float rating = 9.5f;
		String director = "테스형";
		Boolean recommend = true;

		System.out.println("===== Movie Info =====");
		System.out.println("제목 : [" + title + "]");
		System.out.println("개봉년도 : [" + year + "]");
		System.out.println("평점 : [" + rating + "]");
		System.out.println("감독 : [" + director + "]");

		if (recommend) {
			System.out.println("추천합니다!");
		} else {
			System.out.println("추천하지 않습니다!");
		}
	}
}



