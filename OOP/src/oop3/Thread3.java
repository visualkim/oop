package oop3;
 
class Three implements Runnable{
  private String name;
 
  public Three(String name){
    this.name = name;
  }
  
  @Override
  public void run() {
    for (int i=0; i<5; i++){
      System.out.println(i + ": " + name);
    }
  }
  
}
 
public class Thread3 {
 
  public static void main(String[] args) {
    Three three1 = new Three("캐리어 공격");
    Thread thread1 = new Thread(three1);
    thread1.start();
    
    Thread thread2 = new Thread(new Three("드라군 공격"));
    thread2.start();
    
    Thread thread3 = new Thread(new Three("스카우트 공격"));
    thread3.start();
    
  }
 
}