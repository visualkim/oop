package oop3;
 
class ASIA extends Object{
  public ASIA(){
    System.out.println("1) ASIA created.");
  }
}
 
class KOREA extends ASIA{
  public KOREA(){
    System.out.println("2) KOREA created.");
  }  
}
 
class Seoul extends KOREA{
  public Seoul(){
    System.out.println("3) Seoul created.");
  }    
}
 
public class InheTest2 {
  public static void main(String[] args) {
    Seoul seoul = new Seoul();
    
    
 
  }
 
}