package oop3;
 
public class Ex1 {
 
  public static void main(String[] args) {
    int tot = Integer.parseInt(args[0]);
    int cnt = Integer.parseInt(args[1]);
    
    int avg = tot / cnt;
    
    System.out.println("����: " + tot);
    System.out.println("�����: " + cnt);
    System.out.println("���: " + avg);

    System.out.println("������ ����մϴ�.");
    avg =avg + 10;
    System.out.println("��� �߰� ���� �ο�: " + avg);
 
  }
 
}