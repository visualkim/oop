package oop3;
 
class User{ // Data
  private String name;
  private int point;
  
  public User(String name, int point) {
    this.name = name;
    this.point = point;
  }
 
  // setter: set + 첫자를 대문자로 시작하는 변수명
  public void setName(String name){
    this.name = name;
  }
  
  public void setPoint(int point){
    this.point = point;
  }
  
  // getter: get + 첫자를 대문자로하는 변수명
  public String getName(){
    return name;
  }
  
  public int getPoint(){
    return point;
  }
  
}
 
class Act{ // Data 사용
  User user;
  
  public Act(User user){ // Call By Reference, 메모리 연결
    this.user = user;
  }
  
  public synchronized void increase(){ 
    int point = user.getPoint();
    point++;  // 생명력 증가
    user.setPoint(point);
    System.out.println(user.getName() + ": " + user.getPoint());
  }
  
  public synchronized void decrease(){
    int point = user.getPoint();
    point--;  // 생명력 감소
    user.setPoint(point);
    System.out.println(user.getName() + ": " + user.getPoint());
  }
}
 
class Play implements Runnable{
  private Act act;
  
  public Play(Act act){
    this.act = act;
  }
  
  @Override
  public void run() {
    for(int i=0; i<=5; i++){
      act.increase();
      //act.decrease();
    }
  }
    
}
 
public class Thread4 {
 
  public static void main(String[] args) {
    User user1 = new User("왕눈이", 0);
    Act act = new Act(user1);
 
    Thread thread1 = new Thread(new Play(act));
    thread1.start();
 
    Thread thread2 = new Thread(new Play(act));
    thread2.start();
    
    Play play = new Play( act );
    Thread thread3 = new Thread( play );
    //Thread thread3 = new Thread(new Play(act));
    thread3.start();
  }
 
}