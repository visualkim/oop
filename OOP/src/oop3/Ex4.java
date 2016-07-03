package oop3;
 
class Div{
  public void calc(){
    int avg = 250 / 0; // Exception 발생
  }
}
 
public class Ex4 {
  public static void main(String[] args) {
    Div div = new Div();
    
    try{
      div.calc(); // 예외 발생시 예외를 전달 받음.
    }catch(Exception e){
      System.out.println("* 예외 발생됨: " + e.toString());
    }
 
    System.out.println("로직을 계속 실행합니다.");
  }
 
}