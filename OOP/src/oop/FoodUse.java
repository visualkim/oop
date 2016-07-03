package oop;
 
public class FoodUse {
 
  public static void main(String[] args) {
    Food food = new Food(); // °´Ã¼ »ý¼º
    food.print();
    
    food = new Food("¾ßÃ¤ ±è¹ä", 1500, 2);
    food.print();
    
    food = new Food("°£Â¥Àå", 6000, 3);
    food.print();
  }
 
}