package oop;

public class BookUse {

	public static void main(String[] args) {
		/*
		 * [과제] 도서 클래스를 선언하고 객체를 만들어 데이터를 출력하는 클래스를 
		작성하세요.
		
		① Book.java 클래스 선언, 필드 선언
		② BookUse.java 클래스 선언
		③ BookUse 클래스에서 Book 클래스 객체 생성
		④ Book 클래스의 객체에 값을 할당
		⑤ Book 클래스 객체의 필드 값 출력
		⑥ 판매가: 정가 - (정가 * 할인율/100), (int)실수 --> 정수
		
		
		[실행 화면]
		
		도서명: 자바 프로그래밍 기초
		출판사: 교학사
		정   가: 20000 원
		할인율: 10.0 %
		판매가: 18000 원 
		 */
		Book book = new Book();
		book.bookname = "자바 프로그래밍 기초";
		book.publisher = "교학사";
		book.price = 20000;
		book.dc = 10.0;
		
		System.out.println("도서명: " + book.bookname);
		System.out.println("출판사: " + book.publisher);
		System.out.println("정  가: " + book.price + "원");
		System.out.println("할인율: " + book.dc + "%");
		System.out.println("판매가: " + (int)(book.price - (book.price * book.dc/100)) + "원");
		

	}

}
