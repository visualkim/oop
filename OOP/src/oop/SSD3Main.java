package oop;
 
public class SSD3Main {
  public static void main(String[] args) {
    SSD3 ssd1 = new SSD3();
    ssd1.name = "ADATA 128GB";
    ssd1.price = 52000;
    ssd1.dc = ssd1.price - 3000;
    ssd1.point = (int)(ssd1.dc * 0.05);
    ssd1.count = 1;
    
    System.out.println("��ǰ��: " + ssd1.name);
    System.out.println("����: " + ssd1.price);
    System.out.println("���ΰ�: " + ssd1.dc);
    System.out.println("����Ʈ: " + ssd1.point);
    System.out.println("���ż���: " + ssd1.count);
    System.out.println("------------------------------");
  }
 
}