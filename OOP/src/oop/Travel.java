package oop;

public class Travel {
	String title;
	String date;
	
	public void print() {
		System.out.println("목적지: " + title);
		System.out.println("날찌: " + date);
	}
	
	public void setData1(String title, String date) {
		this.title = title;
		this.date = date;
	}
	

}
