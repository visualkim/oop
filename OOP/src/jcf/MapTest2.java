package jcf;
 
import java.util.HashMap;
 
public class MapTest2 {
 
  public static void main(String[] args) {
    Product pro1 = new Product("��Ʈ��", 500000, "�Ƽ���");
    Product pro2 = new Product("�º�", 600000, "LG");
    Product pro3 = new Product("Desktop", 400000, "Dell");
    
    HashMap map = new HashMap();
    map.put("pro1", pro1);
    map.put("pro2", pro2);
    map.put("pro3", pro3);
    
    Product pro = (Product)map.get("pro1");
    pro.print();
    System.out.println("------------------------");
 
    HashMap<String, Product> list = new HashMap<String, Product>();
    list.put("pro1", pro1);
    list.put("pro2", pro2);
    list.put("pro3", pro3);
    // list.put("pro4", "korea");
    pro = list.get("pro2");
    pro.print();
    
  }
 
}