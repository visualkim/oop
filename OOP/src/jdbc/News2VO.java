package jdbc;

public class News2VO {
/*		news2no  INT NOT NULL AUTO_INCREMENT,
		title    VARCHAR(100),
		rdate    DATETIME,*/
	
	private int news2no;
	private String title;
	private String rdate;
	
	public News2VO() {
		
	}
	public News2VO(int news2no, String title, String rdate) {
		this.news2no = news2no;
		this.title = title;
		this.rdate = rdate;
	}
	

	public int getNews2no() {
		return news2no;
	}

	public void setNews2no(int news2no) {
		this.news2no = news2no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
}







