package oop2;

class Winter {
	static String snow;
	String rain;
}

public class Wrapper {

	public static void main(String[] args) {
		
		Winter.snow = "�Թڴ�";	//	���� �޸� �Ҵ�
		System.out.println(Winter.snow);

		int price = Integer.parseInt("25000");
		price = price + 10000;
		
		System.out.println(price);
	}

}
