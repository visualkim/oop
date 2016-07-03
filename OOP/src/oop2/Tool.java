package oop2;
 
import java.text.SimpleDateFormat;
import java.util.Date;
 
class Tool{
  /**
   * 주어진 날짜와 기간을 계산하여 새글 여부 판단
   * 현재 날짜가 2013-02-04, 글을 등록날짜 2013-02-03
   * isNew("2013-02-03", 2) : 글 작성 후 1일 전까지 새글 처리 
   * 
   * @param date 문자열로 된 날짜
   * @param period 새글로 지정할 기간
   * @return
   */
  public boolean isNew(String date, int period) {
    boolean sw = false;
 
    Date _date = new Date();
    // 숫자 형태인 날짜를 '년월일'의 형태로 변환
    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
    try {
      _date = sd.parse(date);
    } catch (Exception e) {
    }
    // System.out.println(date);
    // 1970년1월1일부터 시간을 1000을 1초로하여 계산하여 리턴
    long time = _date.getTime(); // 글을 작성한 시간
 
    // 현재 시간을 1970년 1월 1일부터 수치형식으로 리턴
    long currentTime = System.currentTimeMillis();
 
    // 현재 시간과 글 등록시간의 차이를 계산
    long diff = currentTime - time;
 
    // 1일 86,400,000: 1초를 1000으로 하루를 계산
 
    // ceil: 아주 작은 소수점이 있어도 정수로 반올림 처리됨.
    // 0.0001 --> 1: 오늘 날짜
    // 1.00002 --> 2: 어제 날짜
    int day = (int) Math.ceil(((double) diff / 86400000)); // 지난 날짜 계산
 
    if (day <= period) {
      sw = true; // 최신글 처리
    }
    return sw;
  }
  
  public static void main(String[] args) {
	  Tool tool = new Tool();
	  if( tool.isNew("2016-05-24", 1) == true ) {
		  System.out.println("새글입니다");
	  } else {
		  System.out.println("새글이 아닙니다");
	  }
  }
 
}
 