package oop;
 
public class LevelUse {
 
  public static void main(String[] args) {
    Level test = new Level();
    String grade = test.level(90, 100, 95);
    System.out.println("�� ����: 90 100 95 ���: "+grade+"�� ������");
 
    grade = test.level(80, 80, 85);
    System.out.println("�� ����: 80 80 85 ���: "+grade+"�� ������");
 
    grade = test.level(70, 72, 78);
    System.out.println("�� ����: 70 72 78 ���: "+grade+"�� ������");
  }
 
}