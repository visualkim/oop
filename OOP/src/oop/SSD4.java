package oop;
 
public class SSD4 {
  String name; // �ʵ�, char Ÿ���� ����, ���� ����
  int price;
  int dc;
  int point;
  int count;
  int total;
  
  public void print1(){
	  dc = price - 3000;
	  point = (int)(dc * 0.03);
	  total = dc * count;
	  
	  System.out.println(name);
	  System.out.println("����: " + price);
	  System.out.println("���ΰ�: " + dc);
	  System.out.println("����Ʈ: " + point);
	  System.out.println("���ż���: " + count);
	  System.out.println("����ݾ�: " + total);
  }
}