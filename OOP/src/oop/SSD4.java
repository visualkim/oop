package oop;
 
public class SSD4 {
  String name; // 필드, char 타입의 집합, 가변 길이
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
	  System.out.println("가격: " + price);
	  System.out.println("할인가: " + dc);
	  System.out.println("포인트: " + point);
	  System.out.println("구매수량: " + count);
	  System.out.println("결재금액: " + total);
  }
}