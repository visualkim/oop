package oop;
 
public class FoodUse {
 
  public static void main(String[] args) {
    Food food = new Food(); // ��ü ����
    food.print();
    
    food = new Food("��ä ���", 1500, 2);
    food.print();
    
    food = new Food("��¥��", 6000, 3);
    food.print();
  }
 
}