package oop2;

class Winter {
	static String snow;
	String rain;
}

public class Wrapper {

	public static void main(String[] args) {
		
		Winter.snow = "함박눈";	//	사용시 메모리 할당
		System.out.println(Winter.snow);

		int price = Integer.parseInt("25000");
		price = price + 10000;
		
		System.out.println(price);
	}

}
