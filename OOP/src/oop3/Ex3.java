package oop3;
 
class ExceptionTest{
  public void test1(){
    String str = null;
    System.out.println("str: " + str);
    System.out.println("str.length(): " + str.length()); // 예외 발생 
  }
  
  public void test2(){
    try{
      String str = null;
      System.out.println("str: " + str);
      System.out.println("str.length(): " + str.length());      
    }catch(Exception e){
      e.printStackTrace();
      System.out.println("에러 원인 로그 파일에 기록됨");
      // System.out.println("예외가 발생되었으나 원인 무시");
    }
    System.out.println("다음 코드 계속 실행");
  }
  
  public void test3(){
    try{
      String str = null;
      System.out.println("str: " + str);
      System.out.println("str.length(): " + str.length());      
    }catch(Exception e){
 
    }
    System.out.println("예외 무시후 로직 계속 실행");
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