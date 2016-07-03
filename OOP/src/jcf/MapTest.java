package jcf;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("A01", "웹 개발자");
		map.put("A02", "안드로이드 개발자");
		map.put("A03",  "모바일웹 개발자");
		
		Object obj1 = map.get("A01");
		String str1 = (String)obj1;
		System.out.println(str1);
		
		String str2 = (String)map.get("A02");
		System.out.println(str2);
		
		System.out.println(map.get("A03"));
		
		map.put("2014", 1000000001);
		map.put("2015", 2000000000);
		map.put("2016", 3000000000L);
		
		System.out.println();
		obj1 = map.get("2014");
		int su1 = (Integer)obj1;
		System.out.println(su1);
		
		int su2 = (Integer)map.get("2015");
		System.out.println(su2);
		
		long su3 = (Long)map.get("2016");
		System.out.println(su3);
		System.out.println(map.get("2016"));
	}

}
