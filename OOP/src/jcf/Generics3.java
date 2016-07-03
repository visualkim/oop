package jcf;
 
import java.util.ArrayList;
 
class Print{
  // ArrayList<String> 객체만 전달 받을 수 있음.
  public void print(ArrayList<String> list){
    for(int index=0; index < list.size(); index++){
      System.out.println(list.get(index));
    }
  }
}
 
public class Generics3 {
  public static void main(String[] args) {
    Print print = new Print();
    ArrayList<String> list1 = new ArrayList<String>();
    list1.add("1월");
    list1.add("2월");
    list1.add("3월");
    
    print.print(list1);
    
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    list2.add(2014);
    list2.add(2015);
    list2.add(2016);
    
    // print.print(list2); // ERROR
  }
 
}