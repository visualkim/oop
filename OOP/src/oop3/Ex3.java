package oop3;
 
class ExceptionTest{
  public void test1(){
    String str = null;
    System.out.println("str: " + str);
    System.out.println("str.length(): " + str.length()); // ���� �߻� 
  }
  
  public void test2(){
    try{
      String str = null;
      System.out.println("str: " + str);
      System.out.println("str.length(): " + str.length());      
    }catch(Exception e){
      e.printStackTrace();
      System.out.println("���� ���� �α� ���Ͽ� ��ϵ�");
      // System.out.println("���ܰ� �߻��Ǿ����� ���� ����");
    }
    System.out.println("���� �ڵ� ��� ����");
  }
  
  public void test3(){
    try{
      String str = null;
      System.out.println("str: " + str);
      System.out.println("str.length(): " + str.length());      
    }catch(Exception e){
 
    }
    System.out.println("���� ������ ���� ��� ����");
  }  
}
 
public class Ex3 {
 
  public static void main(String[] args) {
    ExceptionTest et = new ExceptionTest();
    // et.test1();
    // et.test2();
    et.test3();
  }
 
}