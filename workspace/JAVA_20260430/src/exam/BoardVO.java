package exam;

public class BoardVO {
	private int num;
	private String writer;
	private String subject;
	private String contents;
	private String bdate;
	public BoardVO() {
		// TODO Auto-generated constructor stub
	}
	public BoardVO(int num, String writer, String subject, String contents, String bdate) {
		this.num = num;
		this.writer = writer;
		this.subject = subject;
		this.contents = contents;
		this.bdate = bdate;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	
}
