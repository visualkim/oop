package oop;

public class AverageUse {

	public static void main(String[] args) {
		
		Average average = new Average();
		average.avg(90, 100);
	    average.avg(90, 92, 86);
	    average.avg(65.5, 78.7, 93.5);
	    average.avg(80, 75, 79.2);
	    average.avg("¿Õ´«ÀÌ", 80, 100, 90);
	    
	    int[] datas = {86, 95, 65, 70, 88};
	    average.avg(datas);

	}

}
