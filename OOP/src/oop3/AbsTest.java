package oop3;
 
abstract class Payment{
  public void cach(){
    System.out.println("���� ����");
  }
  
  public abstract void card();  // ī�� ����
  public abstract void phone(); // �ڵ��� ����
}
 
class Pay2015 extends Payment {
	@Override
	public void card() {
		System.out.println( "�ſ� ī�� ���� 2.5%" );
	}

	@Override
	public void phone() {
		System.out.println( "�޴��� ���� 300��" );
	}
}
class Pay2016 extends Payment {
	@Override
	public void card() {
		System.out.println( "�ſ� ī�� ���� 1.7%" );
	}

	@Override
	public void phone() {
		System.out.println( "�޴��� ���� 200��" );
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
	  // �θ� Ŭ������ �ڽ� Ŭ������ �Ҵ� ���� �� �ִ�.
	  // pay3�� Ÿ���� Payment
	  // ���� ������ �ִ� �����ʹ� new�� �̿��Ͽ� ������ Pay2015
	  
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














