package oop2;
 
public class NewsMain {
 
	/*�� News.java
	   �� �ʵ�� private���� �����մϴ�.
	   �� �����ڸ� �̿��Ͽ� �ʵ忡 ���� �����մϴ�(����, ��ȸ��, �̵��).
	       �ڵ� ���� ��� ���
	   �� �Աݾ� ���: ��ȸ�� * 200, calc() �޼ҵ� ���� 
	   �� �޼ҵ带 �̿��Ͽ� �ʵ带 ����մϴ�.
	       print() �޼ҵ� ����, DecimalFormat ���*/
	
  public static void main(String[] args) {
    News news = new News("���а� ���� 29�� '���ʰź�'", 1520, "���մ���");
    news.calc();
    news.print();
  }
 
}