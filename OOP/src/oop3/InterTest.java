package oop3;
 
interface Smartphone{
  public abstract void map();		// 추상 메소드
  public abstract void nfc();		// 추상 메소드
  public abstract void bluetooth();	// 추상 메소드
  
}
 
class Android implements Smartphone {
	@Override
	public void map() {
		System.out.println( "Google 맵 지원" );
	}
	@Override
	public void nfc() {
		System.out.println( "사원증 기능 지원" );
	}
	@Override
	public void bluetooth() {
		System.out.println( "블루투스 4.0 지원" );
	}
}
class Iphone implements Smartphone {
	@Override
	public void map() {
		System.out.println( "Apple 맵 지원" );
	}
	@Override
	public void nfc() {
		System.out.println( "교통카드 지원" );
	}
	@Override
	public void bluetooth() {
		System.out.println( "블루투스 3.0 지원" );
	}
	
}
 
 
public class InterTest {
  public static void main(String[] args){
	  // Smartphone sp = new Smartphone();	//Cannot instantiate the type Smartphone
	  Smartphone sp  = new Android();
	  sp.map();
	  sp.nfc();
	  sp.bluetooth();
	  System.out.println( "---------------------" );
	  Smartphone ip = new Iphone();
	  ip.map();
	  ip.nfc();
	  ip.bluetooth();
  }
}
 