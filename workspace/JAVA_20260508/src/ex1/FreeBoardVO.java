package ex1;

public class FreeBoardVO {
	private int num;
	private String title;
	private String writer;
	private String conts;
	private String pwd;
	private int    hit;
	private String date;
	
	public FreeBoardVO() {
		
	}
	
	public FreeBoardVO(String title, String writer, String conts, String pwd, int hit, String date) {
		super();
		this.title = title;
		this.writer = writer;
		this.conts = conts;
		this.pwd = pwd;
		this.hit = hit;
		this.date = date;
	}
	
	public FreeBoardVO(int num, String title, String writer, String conts, String pwd, int hit, String date) {
		super();
		this.num = num;
		this.title = title;
		this.writer = writer;
		this.conts = conts;
		this.pwd = pwd;
		this.hit = hit;
		this.date = date;
	}



	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getConts() {
		return conts;
	}
	public void setConts(String conts) {
		this.conts = conts;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
