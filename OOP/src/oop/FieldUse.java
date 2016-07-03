package oop;
 
public class FieldUse {
 
  public static void main(String[] args) {
    Field field = new Field();
    field.year = 2016;
    field.product = "노트북";
    field.price = 600000;
    field.dc = 3.5;
    field.as = true;
    field.grade = 'A';
    
 
    System.out.println("년도: " + field.year);
    System.out.println("제품: " + field.product);
    System.out.println("가격: " + field.price);
    System.out.println("할인율: " + field.dc);
    System.out.println("AS: " + field.as);
    System.out.println("Grade: " + field.grade);
    
    System.out.println("--------------------------");
    System.out.println("필드의 초기값");
    Field field2 = new Field(); // 객체 생성
    System.out.println("년도: " + field2.year);
    System.out.println("제품: " + field2.product);
    System.out.println("가격: " + field2.price);
    System.out.println("할인율: " + field2.dc);
    System.out.println("AS: " + field2.as);
    System.out.println("Grade: >" + field2.grade + "<");
  }
 
}