package org.semiproject;

public class BookVO {

	private String isbn;		// ISBN
	private String title;		// 도서제목
	private String author;		// 저자
	private String publisher;	// 출판사
	private String pubDate;		// 출판일
	
	private String kdc;			// KDC
	private String ddc;			// DDC
	
	// 도서관 전용
	private String regNo;		//도서 등록 번호
	private String regDate;		//도서 등록일
	
	public BookVO(){
		super();
	}
	
	public BookVO(String isbn, String title, String author, String publisher, String pubDate, String kdc, String ddc, String regNo,
			String regDate) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.pubDate = pubDate;
		this.kdc = kdc;
		this.ddc = ddc;
		this.regNo = regNo;
		this.regDate = regDate;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPubDate() {
		return pubDate;
	}

	public String setPubDate(String spubDate) {
		return pubDate = spubDate;
	}

	public String getKdc() {
		return kdc;
	}

	public String getDdc() {
		return ddc;
	}

	public void setDdc(String ddc) {
		this.ddc = ddc;
	}

	public void setKdc(String kdc) {
		this.kdc = kdc;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}	
}
