package oop;

public class BookUse {

	public static void main(String[] args) {
		/*
		 * [����] ���� Ŭ������ �����ϰ� ��ü�� ����� �����͸� ����ϴ� Ŭ������ 
		�ۼ��ϼ���.
		
		�� Book.java Ŭ���� ����, �ʵ� ����
		�� BookUse.java Ŭ���� ����
		�� BookUse Ŭ�������� Book Ŭ���� ��ü ����
		�� Book Ŭ������ ��ü�� ���� �Ҵ�
		�� Book Ŭ���� ��ü�� �ʵ� �� ���
		�� �ǸŰ�: ���� - (���� * ������/100), (int)�Ǽ� --> ����
		
		
		[���� ȭ��]
		
		������: �ڹ� ���α׷��� ����
		���ǻ�: ���л�
		��   ��: 20000 ��
		������: 10.0 %
		�ǸŰ�: 18000 �� 
		 */
		Book book = new Book();
		book.bookname = "�ڹ� ���α׷��� ����";
		book.publisher = "���л�";
		book.price = 20000;
		book.dc = 10.0;
		
		System.out.println("������: " + book.bookname);
		System.out.println("���ǻ�: " + book.publisher);
		System.out.println("��  ��: " + book.price + "��");
		System.out.println("������: " + book.dc + "%");
		System.out.println("�ǸŰ�: " + (int)(book.price - (book.price * book.dc/100)) + "��");
		

	}

}
