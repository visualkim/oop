package oop;
 
public class MonthUse {
 
  public static void main(String[] args) {
    Month month = new Month();
    String str = month.translation(1);
    System.out.println("1월: " + str);
    
    str = month.translation(2);
    System.out.println("2월: " + str);
    
    System.out.println("3월: " + month.translation(3));
    System.out.println("---------------------");
    
    System.out.println("1월: " + month.translation2(1));
    System.out.println("2월: " + month.translation2(2));
    System.out.println("3월: " + month.translation2(3));
    
  }
 
}