package oop;

public class EvenOdd {
	
	public String number(int num) {
		String eo = "";
		
		if( num % 2 == 0) {
			eo = "¦��";
		} else {
			eo = "Ȧ��";
		}
		return eo;
	}

}
