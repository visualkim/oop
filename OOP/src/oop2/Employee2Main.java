package oop2;
 
public class Employee2Main {
 
  public static void main(String[] args) {
    // Employee2 emp = new Employee2();
    // emp.name = "�մ���"; // The field Employee2.name is not visible
    Employee2 emp1 = new Employee2("�մ���", 67, 75, 89);
    emp1.calc();
    emp1.print();
 
    Employee2 emp2 = new Employee2("�Ʒι�", 89, 100, 60);
    emp2.calc();
    emp2.print();
 
    Employee2 emp3 = new Employee2("����", 100, 90, 95);
    emp3.calc();
    emp3.print();
  }
 
}