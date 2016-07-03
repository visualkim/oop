package oop;
 
public class Food {
  /** 메뉴명 */  // 필드, 전역 변수, instance variable
  String name;
  /** 가격 */
  int price;
  /** 주문 수량 */
  int cnt;
  /** 총 금액 */
  int tot;
  
  public Food() {	//기본생성자, 생략 가능
	  System.out.println("기본 생성자 Food 객체 생성");
	  name = "메뉴 선택 안됨";
  }
  
  public Food(String name, int price, int cnt) {
	  this.name = name;
	  this.price = price;
	  this.cnt = cnt;
	  this.tot = price * cnt;
  }
 
  public void print(){
    System.out.println(name);
    System.out.println(price);
    System.out.println(cnt);
    System.out.println(tot);
    System.out.println("-------------------------------");    
  }
}