package oop;
 
public class FieldUse {
 
  public static void main(String[] args) {
    Field field = new Field();
    field.year = 2016;
    field.product = "��Ʈ��";
    field.price = 600000;
    field.dc = 3.5;
    field.as = true;
    field.grade = 'A';
    
 
    System.out.println("�⵵: " + field.year);
    System.out.println("��ǰ: " + field.product);
    System.out.println("����: " + field.price);
    System.out.println("������: " + field.dc);
    System.out.println("AS: " + field.as);
    System.out.println("Grade: " + field.grade);
    
    System.out.println("--------------------------");
    System.out.println("�ʵ��� �ʱⰪ");
    Field field2 = new Field(); // ��ü ����
    System.out.println("�⵵: " + field2.year);
    System.out.println("��ǰ: " + field2.product);
    System.out.println("����: " + field2.price);
    System.out.println("������: " + field2.dc);
    System.out.println("AS: " + field2.as);
    System.out.println("Grade: >" + field2.grade + "<");
  }
 
}