package oop2;
 
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
 
public class CalendarTest {
 
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println("Date: " + date.toLocaleString());
    
    // Calendar cal = new Calendar(); // Cannot instantiate the type Calendar
    Calendar cal = Calendar.getInstance();
    System.out.print("Calc: " + cal.get(Calendar.YEAR) + ". ");
    System.out.print(cal.get(Calendar.MONTH) + 1 + ". ");
    System.out.print(cal.get(Calendar.DATE));
    
    if(cal.get(Calendar.AM_PM) == 0){
      System.out.print(" 오전 ");
    }else{
      System.out.print(" 오후 ");
    }
    
    System.out.print(cal.get(Calendar.HOUR) + ":");
    System.out.print(cal.get(Calendar.MINUTE) + ":");
    System.out.print(cal.get(Calendar.SECOND) + "\n");
    
    SimpleDateFormat sdf = null;
    sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
    
    Date date2 = new Date();
    String str = sdf.format(date2); // 출력 형식 적용
    System.out.println("1) " + str);
    
    Calendar cal2 = Calendar.getInstance();
    Date date3 = cal2.getTime();
    str = sdf.format(date3); // 출력 형식 적용
    System.out.println("2) " + str);
    
    /*Tool tool = new Tool();
    if (tool.isNew("2016-03-24", 2) == true){
      System.out.println("New 글입니다.");
    }*/
  }
 
}