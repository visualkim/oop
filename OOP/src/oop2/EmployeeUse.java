package oop2;
 
public class EmployeeUse {
 
  public static void main(String[] args) {
    Employee emp = new Employee();  // 객체 생성
    emp.name = "아로미";
    emp.java = 90;
    emp.web = 100;
    emp.dbms = 85;
    
    emp.tot = emp.java + emp.web + emp.dbms;
    // dev.avg = Math.round(dev.tot / 3.0); // 반올림 처리
    
    // dev.avg = dev.tot / 3;
    
    // 소수 첫째자리까지 반올림.
    emp.avg = (emp.tot/3.0) * 10; // 91.666666 --> 916.66666
    // System.out.println(dev.avg);
    emp.avg = Math.round(emp.avg); // 917, 반올림 처리
    // System.out.println(dev.avg);      // 917.0
    emp.avg = emp.avg/10.0; // 91.7
    
    System.out.println("성명: " + emp.name);
    System.out.println("JAVA: " + emp.java);
    System.out.println("WEB: " + emp.web);
    System.out.println("DBMS: " + emp.dbms);
    System.out.println("총점: " + emp.tot);
    System.out.println("평균: " + emp.avg);
 
  }
 
}