package jcf;
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
 
//��ü�� �ߺ������ʰ� ���������� �ѹ��� �����մϴ�.

public class IteratorTest {
  public static void main(String[] args) {
    Product pro1 = new Product("��Ʈ��", 500000, "�Ƽ���");
    Product pro2 = new Product("�º�", 600000, "LG");
    Product pro3 = new Product("Desktop", 400000, "Dell");
    Product pro4 = new Product("SSD256", 80000, "ADATA");
    
    HashMap<String, Product> list = new HashMap<String, Product>();
    list.put("pro1", pro1);
    list.put("pro2", pro2);
    list.put("pro3", pro3);
    list.put("pro4", pro4);
    
    Set<String> keys = list.keySet(); // Ű�� ����
    System.out.println(keys);
    Iterator<String> iter = keys.iterator(); // ��ü ���� ����
    System.out.println(iter);
    
    while(iter.hasNext()){ // ��� �ִ��� �˻�
      String key = iter.next(); // �ϳ��� ��ü ����, Ű�� ����
      System.out.println(key);
      Product product = list.get(key);// Ű�� �ش��ϴ� ��ü(��) ����
      product.print();
      System.out.println("------------------");
    }
    
  }
 
}