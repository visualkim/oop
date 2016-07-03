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
    System.out.println("����: " + this.title);
    System.out.println("��ȸ��: " + df.format(this.view));
    System.out.println("�̵��: " + media);
    System.out.println("�Աݾ�: " + df.format(this.input) + " ��"); 
  }
  
  
}