package oop;

public class Calc {
	
	public int deposit( int month, int sum ) {
		int receive = 0;
		// ó��: ���ɾ� = ���� * �ݾ�   
		receive = month * sum;
		return receive;
	}
	public int deposit( int month, int sum, double interest ) {
		int receive = 0;
		int total = 0;
		/*�Աݾ� = ���� * �ݾ�, �� 100000
          ������ = �Աݾ� * ����, �� 10000 = 100000 * 0.1
          ���ɾ� = �Աݾ� + ������*/
		for( int i = 2; i <= month; i++ ) {
			total = (int)(total + sum);
			receive = (int)(total + ((total + sum) * interest/100));		
					//((total + sum) + (((total + sum)/100) * interest));
		}
		return receive;
	}
	/**
	   * ���� ������ ����մϴ�.
	   * @param price ���� ����
	   * @return �Ŵ� ���� ���ɾ�
	   */
	public int home( int sum ) {
		int receive = 0;
		// ó��: �Ŵ� �����ϴ� ���� ��� = ���� ������ 3.9 % / 12
		receive = (int)((sum * 3.9/100) / 12);
		return receive;
	}

}
