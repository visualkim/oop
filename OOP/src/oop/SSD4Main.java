package oop;

public class SSD4Main {

	public static void main(String[] args) {
		/*
		 * ��ǰ��: ADATA 128 GB
		����: 58000
		���ΰ�: 55000
		����Ʈ: 1650
		���ż���: 1
		����ݾ�: 55000
		---------------------------------
		��ǰ��: ADATA 256 GB
		����: 90000
		���ΰ�: 87000
		����Ʈ: 2610
		���ż���: 2
		����ݾ�: 174000
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
