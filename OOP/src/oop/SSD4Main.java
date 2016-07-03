package oop;

public class SSD4Main {

	public static void main(String[] args) {
		/*
		 * 제품명: ADATA 128 GB
		가격: 58000
		할인가: 55000
		포인트: 1650
		구매수량: 1
		결재금액: 55000
		---------------------------------
		제품명: ADATA 256 GB
		가격: 90000
		할인가: 87000
		포인트: 2610
		구매수량: 2
		결재금액: 174000
		---------------------------------
		 */
		SSD4 ssd1 = new SSD4();
		ssd1.name = "ADATA 128 GB";
		ssd1.price = 58000;
		ssd1.count = 1;
		ssd1.print1();
		
		SSD4 ssd2 = new SSD4();
		ssd2.name = "ADATA 256 GB";
		ssd2.price = 90000;
		ssd2.count = 2;
		ssd2.print1();

	}

}
