package oop3;
 
public class Ex2 {
 
  public static void main(String[] args) {
    int tot = 0;
    int cnt = 0;
    int avg = 0;
    
    try{
      tot = Integer.parseInt(args[0]);
      cnt = Integer.parseInt(args[1]);
      avg = tot / cnt;
 
      System.out.println("����: " + tot);
      System.out.println("�����: " + cnt);
      System.out.println("���: " + avg);
      
    }catch(Exception e){
      e.printStackTrace();
    }
 
    System.out.println("������ ����մϴ�.");
    avg =avg + 10;
    System.out.println("��� �߰� ���� �ο�: " + avg);
  }
 
}