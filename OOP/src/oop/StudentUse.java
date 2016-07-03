package oop;
 
public class StudentUse {
 
  public static void main(String[] args) {
    // 메모리 할당, student: 객체명
    Student student = new Student();
    student.no = "IT20150401";
    student.name="아로미";
    student.score = 8.5;
    
    System.out.println("학번: " + student.no);
    System.out.println("성명: " + student.name);
    System.out.println("점수: " + student.score);
    System.out.println("--------------------------");
    System.out.println("JVM이 할당한 메모리 번호");
    System.out.println(student);
    System.out.println(student.hashCode());
  }
 
}