package oop;

public class Average {
	/*
	 * [����] ����� ���Ͽ� ����ϴ� �޼ҵ带 �����ϼ���.
        - �޼Ҹ�: avg(...)
		
		[���� ȭ��]
		
		1) 95
		2) 89
		3) 79
		4) 78
		5) �մ��� 90
		6) 80
		
		 
		�� /src/oop/Average.java
		    - �ʵ带 ������ �ʿ䰡 �������� this�� ����� �ʿ䰡 �����ϴ�.
		    - �޼ҵ�ȿ��� ����� ���Ͽ� ����մϴ�.
		    - avg �޼ҵ尡 ����Ǿ�� �մϴ�.
		    - int avg ���� ������ ����Ǿ�� �մϴ�.
		    - �Ǽ��� ������ ����: (int)10.5 --> 10
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
