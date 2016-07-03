package oop;

public class Average {
	/*
	 * [과제] 평균을 구하여 출력하는 메소드를 구현하세요.
        - 메소명: avg(...)
		
		[실행 화면]
		
		1) 95
		2) 89
		3) 79
		4) 78
		5) 왕눈이 90
		6) 80
		
		 
		▷ /src/oop/Average.java
		    - 필드를 선언할 필요가 없음으로 this를 사용할 필요가 없습니다.
		    - 메소드안에서 평균을 구하여 출력합니다.
		    - avg 메소드가 선언되어야 합니다.
		    - int avg 지역 변수가 선언되어야 합니다.
		    - 실수를 정수로 변경: (int)10.5 --> 10
	 */
	/*
	public void avg(int num1, int num2) {
		int avg = (int)((num1 + num2) /2);
		System.out.println(avg);
	}
	public void avg(int num1, int num2, int num3) {
		int avg = (int)((num1 + num2 + num3) /3);
		System.out.println(avg);
	}
	public void avg(double num1, double num2, double num3) {
		int avg = (int)((num1 + num2 + num3) /3);
		System.out.println(avg);
	}
	public void avg(int num1, int num2, double num3) {
		int avg = (int)((num1 + num2 + num3) /3);
		System.out.println(avg);
	}
	public void avg(String name, double num1, double num2, double num3) {
		int avg = (int)((num1 + num2 + num3) /3);
		System.out.println(name + " " + avg);
	}
	public void avg(int datas[]) {
		int tot = 0;
		for( int i = 0; i < datas.length; i++ ) {
			tot = tot + datas[i];
		}
		int avg = (int)(tot / datas.length);
		System.out.println(avg);
	}
	*/
	public void avg(int su1, int su2){
	    int tot = su1 + su2;
	    int avg = tot / 2;
	    System.out.println("1) " + avg);
	  }
	 
	  public void avg(int su1, int su2, int su3){
	    int tot = su1 + su2 + su3;
	    int avg = tot / 3;
	    System.out.println("2) " + avg);
	  }
	 
	  public void avg(double su1, double su2, double su3){
	    int tot = (int)(su1 + su2 + su3);
	    int avg = tot / 3;
	    System.out.println("3) " + avg);
	  }
	  
	  public void avg(int su1, int su2, double su3){
	    int tot = (int)(su1 + su2 + su3);
	    int avg = tot / 3;
	    System.out.println("4) " + avg);
	  }
	  
	  public void avg(String name, int su1, int su2, int su3){
	    int tot = su1 + su2 + su3;
	    int avg = tot / 3;
	    System.out.println("5) " + name + " " + avg);
	  }
	  
	  public void avg(int[] datas){
	    int tot = 0;
	    for(int index=0; index < datas.length; index++){
	      tot = tot + datas[index];
	    }
	    int avg = tot / datas.length;
	    System.out.println("6) " + avg);
	  }
}
