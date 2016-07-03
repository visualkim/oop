package jcf;
 
import java.util.ArrayList;
 
public class Generics2 {
 
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("JAVA");
    list.add("HTML5");
    list.add("CSS3");
    // list.add(2016); // ERROR
    
   String str = list.get(0);   // 형변환 필요 없음.
   System.out.println(str);
   
   str = list.get(1);
   System.out.println(str);
   
   str = list.get(2);
   System.out.println(str);
   
   ArrayList<Integer> sales = new ArrayList<Integer>();
   sales.add(10000000);
   sales.add(20000000);
   sales.add(30000000);
   
   System.out.println();
   int sale = sales.get(0) + 5000000; //자동 형변환
   System.out.println(sale);
   
   sale = sales.get(1) + 5000000;
   System.out.println(sale);
   
   sale = sales.get(2) + 5000000;
   System.out.println(sale);
 
  }
 
}