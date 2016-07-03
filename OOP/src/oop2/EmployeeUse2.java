package oop2;
 
public class EmployeeUse2 {
 
  public static void main(String[] args) {
    Employee emp = new Employee();  // ∞¥√º ª˝º∫
    emp.name = "≈ı≈ı";
    emp.java = 90;
    emp.web = 100;
    emp.dbms = 85;
    
    emp.tot = emp.java + emp.web + emp.dbms;
    emp.avg = emp.tot / 3.0;
    
    System.out.println("º∫∏Ì: " + emp.name);
    System.out.println("JAVA: " + emp.java);
    System.out.println("WEB: " + emp.web);
    System.out.println("DBMS: " + emp.dbms);
    System.out.println("√—¡°: " + emp.tot);
    System.out.println("∆Ú±’: " + emp.avg);
 
  }
 
}