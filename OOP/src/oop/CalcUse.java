package oop;
 
public class CalcUse {
 
  public static void main(String[] args) {
    Calc calc = new Calc();
    int deposit = calc.deposit(12, 200000);
    System.out.println("1) 12 개월, 20만원: "+deposit+" 원");
    
    deposit = calc.deposit(12, 300000);
    System.out.println("2) 12 개월, 30만원: "+deposit+" 원");
    
    deposit = calc.deposit(24, 200000, 2.25);
    System.out.println("3) 24 개월, 20만원, 2.25% 이자: "+deposit+" 원");
 
    deposit = calc.deposit(36, 300000, 2.50);
    System.out.println("4) 36 개월, 30만원, 2.50% 이자: "+deposit+" 원");
    
    int receive = calc.home(150000000);
    System.out.println("5) 1억 5천만원 주택 연금 수령액: " + receive + " 원");
 
    receive = calc.home(200000000);
    System.out.println("6) 2억원 주택 연금 수령액: " + receive + " 원");
    
  }
 
}