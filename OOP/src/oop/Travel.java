package oop;

public class Travel {
	String title;
	String date;
	
	public void print() {
		System.out.println("������: " + title);
		System.out.println("����: " + date);
	}
	
	public void setData1(String title, String date) {
		this.title = title;
		this.date = date;
	}
	

}
