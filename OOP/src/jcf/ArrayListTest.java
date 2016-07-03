package jcf;
 
import java.util.ArrayList;
 
public class ArrayListTest {
 
  public static void main(String[] args) {
    String[] array = new String[3];
    array[0] = "JAVA";
    array[1] = "HTML5";
    array[2] = "CSS3";
    
    ArrayList list = new ArrayList();
    list.add("JAVA");
    list.add("HTML5");
    list.add("CSS3");
    
    for(int i=0; i<=2; i++){
      System.out.println(array[i] + "/" + list.get(i));
    }
 
    // array[3] = "Javascript";
    list.add("Javascript");
    System.out.println(list.size());
    list.add("JSP");
    System.out.println(list.size());
    
    
    list.add("JSP Programmer");
    System.out.println(list.size());
    
    //String str = list.get(5);
    Object obj = list.get(5);
    String str = (String)obj;
    
    System.out.println(str.toLowerCase());
    System.out.println(str.toUpperCase());
    System.out.println(str.length());
    System.out.println(str.substring(4, 11));
  }
 
}