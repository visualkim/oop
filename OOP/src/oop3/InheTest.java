package oop3;
 
/*[실행 화면]
1) 모토롤라
전화 기능
문자 기능
---------------------
2) Sumgsung
전화 기능
문자 기능
멀티미디어 메시지
---------------------
2) Android
전화 기능
문자 기능
멀티미디어 메시지
인터넷*/
class Phone{
  String phone_name = "모토롤라";
  
  public void tel(){ System.out.println("전화 기능"); }
  public void sms(){ System.out.println("문자 기능"); }
}
 
class PDA extends Phone{
  String pda_name = "Sumgsung";
  
  public void mms(){ System.out.println("멀티미디어 메시지");}
}
 
class Smart extends PDA{
  String smart_name = "Android";
  
  public void internet(){ System.out.println("인터넷"); }
}
 
 
public class InheTest {
  public static void main(String[] args) {
	  Smart smart = new Smart();
	  PDA pda = new PDA();
	  Phone phone = new Phone();
	  
	  System.out.println("1) + " + phone.phone_name);
	  phone.tel();
	  phone.sms();
	  System.out.println("2) + " + pda.pda_name);
	  pda.tel();
	  pda.sms();
	  pda.mms();
	  System.out.println("3) + " + smart.smart_name);
	  smart.tel();
	  smart.sms();
	  smart.mms();
	  smart.internet();
  }
 
}