package oop2;
class Final{
  public String normal = "2016�� 1��";
  public static String staticStr = "2016�� 2��";
  public final static String finalStr1 = null;
  public static final String finalStr2 = "2016�� 5�� ķ��";  // ��� ����
}
 
public class FinalTest {
 
  public static void main(String[] args) {
    Final fin = new Final();
    System.out.println(fin.normal);
    System.out.println(Final.staticStr); // static ����
    Final.staticStr = "2016�� 3��";
    System.out.println(Final.staticStr);
    // The final field Final.finalStr1 cannot be assigned
    // Final.finalStr1 = "2016�� 4��"; 
    System.out.println(Final.finalStr2);
  }
 
}