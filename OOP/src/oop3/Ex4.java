package oop3;
 
class Div{
  public void calc(){
    int avg = 250 / 0; // Exception �߻�
  }
}
 
public class Ex4 {
  public static void main(String[] args) {
    Div div = new Div();
    
    try{
      div.calc(); // ���� �߻��� ���ܸ� ���� ����.
    }catch(Exception e){
      System.out.println("* ���� �߻���: " + e.toString());
    }
 
    System.out.println("������ ��� �����մϴ�.");
  }
 
}