package oop2;
 
public class Employee2 {
  private String name;
  private int java;
  private int web;
  private int dbms;
  private int tot;
  private double avg;
  private char level;
  
  public Employee2() {
    
  }
 
  public Employee2(String name, int java, int web, int dbms) {
    this.name = name;
    this.java = java;
    this.web = web;
    this.dbms = dbms;
  }
  
  public void calc(){
    tot = java + web + dbms;
    avg = (tot/3.0) * 10; // 91.666666 --> 916.66666
    avg = Math.round(avg); // 917
    avg = avg/10.0; // 91.7, 반올림 처리    

    if (avg >= 90 && avg <= 100){
      level = 'A';
    }else if (avg >= 80 && avg <= 89){
      level = 'B';
    }else if (avg >= 70 && avg <= 79){
      level = 'C';
    }else if (avg >= 0 && avg <= 69){
      level = 'D';
    } 
  }
  
  public void print(){
    System.out.println("성명: " + name);
    System.out.println("JAVA: " + java);
    System.out.println("WEB: " + web);
    System.out.println("DBMS: " + dbms);
    System.out.println("총점: " + tot);
    System.out.println("평균: " + avg);
    System.out.println("등급: " + level);
    System.out.println("------------------");
  }
  
}