package oop3;
 
class Book{
  public void print(){
    System.out.println("å�� �ֹ��մϴ�.");
  }
}
 
class Java extends Book{
  // ��� ���õǰ� ȣ���.
  @Override 
  public void print(){
    System.out.println("JAVA å�� �ֹ��մϴ�.");
  }
}
 
public class InheTest3 {
 
  public static void main(String[] args) {
    Java java = new Java();
    java.print();
 
  }
 
}