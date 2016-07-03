package jcf;
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
 
//객체를 중복되지않게 순차적으로 한번만 추출합니다.

public class IteratorTest {
  public static void main(String[] args) {
    Product pro1 = new Product("노트북", 500000, "아수스");
    Product pro2 = new Product("태블릿", 600000, "LG");
    Product pro3 = new Product("Desktop", 400000, "Dell");
    Product pro4 = new Product("SSD256", 80000, "ADATA");
    
    HashMap<String, Product> list = new HashMap<String, Product>();
    list.put("pro1", pro1);
    list.put("pro2", pro2);
    list.put("pro3", pro3);
    list.put("pro4", pro4);
    
    Set<String> keys = list.keySet(); // 키만 추출
    System.out.println(keys);
    Iterator<String> iter = keys.iterator(); // 객체 순차 접근
    System.out.println(iter);
    
    while(iter.hasNext()){ // 요소 있는지 검사
      String key = iter.next(); // 하나의 객체 추출, 키만 추출
      System.out.println(key);
      Product product = list.get(key);// 키에 해당하는 객체(값) 추출
      product.print();
      System.out.println("------------------");
    }
    
  }
 
}