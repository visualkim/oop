package oop3;
 
interface Smartphone{
  public abstract void map();		// �߻� �޼ҵ�
  public abstract void nfc();		// �߻� �޼ҵ�
  public abstract void bluetooth();	// �߻� �޼ҵ�
  
}
 
class Android implements Smartphone {
	@Override
	public void map() {
		System.out.println( "Google �� ����" );
	}
	@Override
	public void nfc() {
		System.out.println( "����� ��� ����" );
	}
	@Override
	public void bluetooth() {
		System.out.println( "������� 4.0 ����" );
	}
}
class Iphone implements Smartphone {
	@Override
	public void map() {
		System.out.println( "Apple �� ����" );
	}
	@Override
	public void nfc() {
		System.out.println( "����ī�� ����" );
	}
	@Override
	public void bluetooth() {
		System.out.println( "������� 3.0 ����" );
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
 