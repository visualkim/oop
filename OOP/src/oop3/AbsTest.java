package oop3;
 
abstract class Payment{
  public void cach(){
    System.out.println("현금 결재");
  }
  
  public abstract void card();  // 카드 결재
  public abstract void phone(); // 핸드폰 결재
}
 
class Pay2015 extends Payment {
	@Override
	public void card() {
		System.out.println( "신용 카드 결제 2.5%" );
	}

	@Override
	public void phone() {
		System.out.println( "휴대폰 결제 300원" );
	}
}
class Pay2016 extends Payment {
	@Override
	public void card() {
		System.out.println( "신용 카드 결제 1.7%" );
	}

	@Override
	public void phone() {
		System.out.println( "휴대폰 결제 200원" );
	}
}
 
public class AbsTest {
  public static void main(String[] args) {
	  
	  // Payment payment = new Payment();	//Cannot instantiate the type Payment
	  Pay2015 pay2015 = new Pay2015();
	  pay2015.cach();
	  pay2015.card();
	  pay2015.phone();
	  System.out.println( "--------------------" );
 
	  Pay2016 pay2016 = new Pay2016();
	  pay2016.cach();
	  pay2016.card();
	  pay2016.phone();
	  System.out.println( "--------------------" );
	  // 부모 클래스는 자식 클래스를 할당 받을 수 있다.
	  // pay3의 타입은 Payment
	  // 실제 가지고 있는 데이터는 new를 이용하여 생성한 Pay2015
	  
	  Payment pay3 = new Pay2015();
	  pay3.cach();
	  pay3.card();
	  pay3.phone();
	  System.out.println( "--------------------" );

	  pay3 = new Pay2016();
	  pay3.cach();
	  pay3.card();
	  pay3.phone();
  }
 
}














