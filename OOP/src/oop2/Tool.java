package oop2;
 
import java.text.SimpleDateFormat;
import java.util.Date;
 
class Tool{
  /**
   * �־��� ��¥�� �Ⱓ�� ����Ͽ� ���� ���� �Ǵ�
   * ���� ��¥�� 2013-02-04, ���� ��ϳ�¥ 2013-02-03
   * isNew("2013-02-03", 2) : �� �ۼ� �� 1�� ������ ���� ó�� 
   * 
   * @param date ���ڿ��� �� ��¥
   * @param period ���۷� ������ �Ⱓ
   * @return
   */
  public boolean isNew(String date, int period) {
    boolean sw = false;
 
    Date _date = new Date();
    // ���� ������ ��¥�� '�����'�� ���·� ��ȯ
    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
    try {
      _date = sd.parse(date);
    } catch (Exception e) {
    }
    // System.out.println(date);
    // 1970��1��1�Ϻ��� �ð��� 1000�� 1�ʷ��Ͽ� ����Ͽ� ����
    long time = _date.getTime(); // ���� �ۼ��� �ð�
 
    // ���� �ð��� 1970�� 1�� 1�Ϻ��� ��ġ�������� ����
    long currentTime = System.currentTimeMillis();
 
    // ���� �ð��� �� ��Ͻð��� ���̸� ���
    long diff = currentTime - time;
 
    // 1�� 86,400,000: 1�ʸ� 1000���� �Ϸ縦 ���
 
    // ceil: ���� ���� �Ҽ����� �־ ������ �ݿø� ó����.
    // 0.0001 --> 1: ���� ��¥
    // 1.00002 --> 2: ���� ��¥
    int day = (int) Math.ceil(((double) diff / 86400000)); // ���� ��¥ ���
 
    if (day <= period) {
      sw = true; // �ֽű� ó��
    }
    return sw;
  }
  
  public static void main(String[] args) {
	  Tool tool = new Tool();
	  if( tool.isNew("2016-05-24", 1) == true ) {
		  System.out.println("�����Դϴ�");
	  } else {
		  System.out.println("������ �ƴմϴ�");
	  }
  }
 
}
 