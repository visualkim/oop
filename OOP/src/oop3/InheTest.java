package oop3;
 
/*[���� ȭ��]
1) ����Ѷ�
��ȭ ���
���� ���
---------------------
2) Sumgsung
��ȭ ���
���� ���
��Ƽ�̵�� �޽���
---------------------
2) Android
��ȭ ���
���� ���
��Ƽ�̵�� �޽���
���ͳ�*/
class Phone{
  String phone_name = "����Ѷ�";
  
  public void tel(){ System.out.println("��ȭ ���"); }
  public void sms(){ System.out.println("���� ���"); }
}
 
class PDA extends Phone{
  String pda_name = "Sumgsung";
  
  public void mms(){ System.out.println("��Ƽ�̵�� �޽���");}
}
 
class Smart extends PDA{
  String smart_name = "Android";
  
  public void internet(){ System.out.println("���ͳ�"); }
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