package oop3;
 
class Test{
  // Call By Value
  public void calc(int tot, int cnt) throws Exception{
    int avg = tot / cnt;
    System.out.println("avg: " + avg);
  }
  
  public void print(String name) throws Exception{
    System.out.println("Name: " + name.toLowerCase());
  }
}
 
public class Ex5 {
 
  public static void main(String[] args) {
    Test test = new Test();
    
    try{
      test.calc(250, 0);
    }catch(Exception e){
      e.printStackTrace();
    }
    
    System.out.println("나머지 루틴 정상 실행");
    
    try{
      test.print(null);
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      System.out.println("무조건 실행, 메모리해제등에 사용.");
    }
  }
 
}