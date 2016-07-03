package oop;
 
public class CalcUse {
 
  public static void main(String[] args) {
    Calc calc = new Calc();
    int deposit = calc.deposit(12, 200000);
    System.out.println("1) 12 ����, 20����: "+deposit+" ��");
    
    deposit = calc.deposit(12, 300000);
    System.out.println("2) 12 ����, 30����: "+deposit+" ��");
    
    deposit = calc.deposit(24, 200000, 2.25);
    System.out.println("3) 24 ����, 20����, 2.25% ����: "+deposit+" ��");
 
    deposit = calc.deposit(36, 300000, 2.50);
    System.out.println("4) 36 ����, 30����, 2.50% ����: "+deposit+" ��");
    
    int receive = calc.home(150000000);
    System.out.println("5) 1�� 5õ���� ���� ���� ���ɾ�: " + receive + " ��");
 
    receive = calc.home(200000000);
    System.out.println("6) 2��� ���� ���� ���ɾ�: " + receive + " ��");
    
  }
 
}