package oop;
 
public class Food {
  /** �޴��� */  // �ʵ�, ���� ����, instance variable
  String name;
  /** ���� */
  int price;
  /** �ֹ� ���� */
  int cnt;
  /** �� �ݾ� */
  int tot;
  
  public Food() {	//�⺻������, ���� ����
	  System.out.println("�⺻ ������ Food ��ü ����");
	  name = "�޴� ���� �ȵ�";
  }
  
  public Food(String name, int price, int cnt) {
	  this.name = name;
	  this.price = price;
	  this.cnt = cnt;
	  this.tot = price * cnt;
  }
 
  public void print(){
    System.out.println(name);
    System.out.println(price);
    System.out.println(cnt);
    System.out.println(tot);
    System.out.println("-------------------------------");    
  }
}