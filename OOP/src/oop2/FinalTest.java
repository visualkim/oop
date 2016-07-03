package oop2;
class Final{
  public String normal = "2016년 1월";
  public static String staticStr = "2016년 2월";
  public final static String finalStr1 = null;
  public static final String finalStr2 = "2016년 5월 캠핑";  // 상수 선언
}
 
public class FinalTest {
 
  public static void main(String[] args) {
    Final fin = new Final();
    System.out.println(fin.normal);
    System.out.println(Final.staticStr); // static 변수
    Final.staticStr = "2016년 3월";
    System.out.println(Final.staticStr);
    // The final field Final.finalStr1 cannot be assigned
    // Final.finalStr1 = "2016년 4월"; 
    System.out.println(Final.finalStr2);
  }
 
}