package oop;

public class Level {
	
	/*
	 * [조건]
		평균에 따른 등급 구간
		A: 90 ~ 100
		B: 80 ~ 89
		C: 70 ~ 79
		D: 60 ~ 69
		F:   0 ~ 59
	 */
	
	
	public String level(int num1, int num2, int num3) {
		int avg = (int)((num1 + num2 + num3)/3);
		
		String grade = "";
		if( 90 <= avg && avg <= 100 ) { grade = "A"; }
		if( 80 <= avg && avg <= 89 ) { grade = "B"; }
		if( 70 <= avg && avg <= 79 ) { grade = "C"; }
		if( 60 <= avg && avg <= 69 ) { grade = "D"; }
		if( 0 <= avg && avg <= 59 ) { grade = "F"; }
		
		return grade;
	}
}
