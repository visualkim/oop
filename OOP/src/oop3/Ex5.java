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
    
    System.out.println("������ ��ƾ ���� ����");
    
    try{
      test.print(null);
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      System.out.println("������ ����, �޸������ ���.");
    }
  }
 
}