package oop;

public class Month {
	
	/*
	 * [���� ȭ��]
		1��: January
		2��: February
		3��: March
		---------------------
		1��: January
		2��: February
		3��: March
	 */
	
	public String translation( int num ) {
		String str = "";
		if( num == 1 ) {
			str = "January";
		} else if( num == 2 ) {
			str = "February";
		} else if( num == 3 ) {
			str = "March";
		}
		
		return str;
	}
	public String translation2( int num ) {
		String month[] = { "January", "February", "March" };
		
		return month[num-1];
	}

}
