package oop3;
 
public class Ex2 {
 
  public static void main(String[] args) {
    int tot = 0;
    int cnt = 0;
    int avg = 0;
    
    try{
      tot = Integer.parseInt(args[0]);
      cnt = Integer.parseInt(args[1]);
      avg = tot / cnt;
 
      System.out.println("총점: " + tot);
      System.out.println("과목수: " + cnt);
      System.out.println("평균: " + avg);
      
    }catch(Exception e){
      e.printStackTrace();
    }
 
    System.out.println("진행을 계속합니다.");
    avg =avg + 10;
    System.out.println("평균 추가 점수 부여: " + avg);
  }
 
}