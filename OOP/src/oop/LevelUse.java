package oop;
 
public class LevelUse {
 
  public static void main(String[] args) {
    Level test = new Level();
    String grade = test.level(90, 100, 95);
    System.out.println("평가 점수: 90 100 95 결과: "+grade+"급 개발자");
 
    grade = test.level(80, 80, 85);
    System.out.println("평가 점수: 80 80 85 결과: "+grade+"급 개발자");
 
    grade = test.level(70, 72, 78);
    System.out.println("평가 점수: 70 72 78 결과: "+grade+"급 개발자");
  }
 
}