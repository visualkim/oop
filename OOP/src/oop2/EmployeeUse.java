package oop2;
 
public class EmployeeUse {
 
  public static void main(String[] args) {
    Employee emp = new Employee();  // ��ü ����
    emp.name = "�Ʒι�";
    emp.java = 90;
    emp.web = 100;
    emp.dbms = 85;
    
    emp.tot = emp.java + emp.web + emp.dbms;
    // dev.avg = Math.round(dev.tot / 3.0); // �ݿø� ó��
    
    // dev.avg = dev.tot / 3;
    
    // �Ҽ� ù°�ڸ����� �ݿø�.
    emp.avg = (emp.tot/3.0) * 10; // 91.666666 --> 916.66666
    // System.out.println(dev.avg);
    emp.avg = Math.round(emp.avg); // 917, �ݿø� ó��
    // System.out.println(dev.avg);      // 917.0
    emp.avg = emp.avg/10.0; // 91.7
    
    System.out.println("����: " + emp.name);
    System.out.println("JAVA: " + emp.java);
    System.out.println("WEB: " + emp.web);
    System.out.println("DBMS: " + emp.dbms);
    System.out.println("����: " + emp.tot);
    System.out.println("���: " + emp.avg);
 
  }
 
}