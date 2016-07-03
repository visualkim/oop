package oop;

public class Calc {
	
	public int deposit( int month, int sum ) {
		int receive = 0;
		// 처리: 수령액 = 개월 * 금액   
		receive = month * sum;
		return receive;
	}
	public int deposit( int month, int sum, double interest ) {
		int receive = 0;
		int total = 0;
		/*입금액 = 개월 * 금액, ← 100000
          총이자 = 입금액 * 이자, ← 10000 = 100000 * 0.1
          수령액 = 입금액 + 총이자*/
		for( int i = 2; i <= month; i++ ) {
			total = (int)(total + sum);
			receive = (int)(total + ((total + sum) * interest/100));		
					//((total + sum) + (((total + sum)/100) * interest));
		}
		return receive;
	}
	/**
	   * 주택 연금을 계산합니다.
	   * @param price 주택 가격
	   * @return 매달 수령 가능액
	   */
	public int home( int sum ) {
		int receive = 0;
		// 처리: 매달 수령하는 주택 년금 = 주택 가격의 3.9 % / 12
		receive = (int)((sum * 3.9/100) / 12);
		return receive;
	}

}
