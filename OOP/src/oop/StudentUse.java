package oop;
 
public class StudentUse {
 
  public static void main(String[] args) {
    // �޸� �Ҵ�, student: ��ü��
    Student student = new Student();
    student.no = "IT20150401";
    student.name="�Ʒι�";
    student.score = 8.5;
    
    System.out.println("�й�: " + student.no);
    System.out.println("����: " + student.name);
    System.out.println("����: " + student.score);
    System.out.println("--------------------------");
    System.out.println("JVM�� �Ҵ��� �޸� ��ȣ");
    System.out.println(student);
    System.out.println(student.hashCode());
  }
 
}