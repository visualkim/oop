package oop2;
 
public class Employee2Main {
 
  public static void main(String[] args) {
    // Employee2 emp = new Employee2();
    // emp.name = "ø’¥´¿Ã"; // The field Employee2.name is not visible
    Employee2 emp1 = new Employee2("ø’¥´¿Ã", 67, 75, 89);
    emp1.calc();
    emp1.print();
 
    Employee2 emp2 = new Employee2("æ∆∑ŒπÃ", 89, 100, 60);
    emp2.calc();
    emp2.print();
 
    Employee2 emp3 = new Employee2("≈ı≈ı", 100, 90, 95);
    emp3.calc();
    emp3.print();
  }
 
}