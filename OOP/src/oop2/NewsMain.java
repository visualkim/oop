package oop2;
 
public class NewsMain {
 
	/*▷ News.java
	   ① 필드는 private으로 선언합니다.
	   ② 생성자를 이용하여 필드에 값을 저장합니다(제목, 조회수, 미디어).
	       자동 생성 기능 사용
	   ③ 입금액 계산: 조회수 * 200, calc() 메소드 선언 
	   ④ 메소드를 이용하여 필드를 출력합니다.
	       print() 메소드 선언, DecimalFormat 사용*/
	
  public static void main(String[] args) {
    News news = new News("사학과 교수 29명 '집필거부'", 1520, "연합뉴스");
    news.calc();
    news.print();
  }
 
}