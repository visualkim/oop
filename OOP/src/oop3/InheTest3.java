package oop3;
 
class Book{
  public void print(){
    System.out.println("책을 주문합니다.");
  }
}
 
class Java extends Book{
  // 상속 무시되고 호출됨.
  @Override 
  public void print(){
    System.out.println("JAVA 책을 주문합니다.");
  }
}
 
public class InheTest3 {
 
  public static void main(String[] args) {
    Java java = new Java();
    java.print();
 
  }
 
}