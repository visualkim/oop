package oop2;
 
import java.text.DecimalFormat;
 
public class News {
  private String title;
  private int view;
  private String media;
  private int input;
  
  public News(){ }
 
  
  
  public News(String title, int view, String media) {
	this.title = title;
	this.view = view;
	this.media = media;
}

  public void calc() {
	  input = view * 200;
	  
  }


public void print(){
    DecimalFormat df = new DecimalFormat("#,###,###");
    System.out.println("제목: " + this.title);
    System.out.println("조회수: " + df.format(this.view));
    System.out.println("미디어: " + media);
    System.out.println("입금액: " + df.format(this.input) + " 원"); 
  }
  
  
}