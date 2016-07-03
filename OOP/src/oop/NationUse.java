package oop;
 
class Nation{
  public String getNation(String country){
    String str = ""; // 지역 변수
    
    if (country.equals("KOR") == true){
      str = "한국";
    }else if (country.equals("JAP") == true){
      str = "일본"; 
    }else if(country.equals("CHA") == true){
      str = "중국";
    }else{
      str = "알수 없는 국가";
    }
    
    return str;
    
  }
  
  public int getGDP(String country){
    int gdp = 0;
    
    if (country.equals("KOR")){
      gdp = 28738;
    }else if (country.equals("JAP")){
      gdp = 37539;
    }else if (country.equals("CHA")){
      gdp = 6747;
    }
    
    return gdp;
  }
  
  public boolean check(String country){
    boolean bol = false;
    if (country.equals("KOR") || country.equals("kor")){
      bol = true;
    }else{
      bol = false; // 생략 가능
    }
    
    return bol;
  }
  
}
 
public class NationUse {
 
  public static void main(String[] args) {
    Nation nation = new Nation();
    String name = nation.getNation("KOR");
    System.out.println(name);
    
    name = nation.getNation("JAP");
    System.out.println(name);
    
    name = nation.getNation("CHA");
    System.out.println(name);
    
    int gdp = nation.getGDP("KOR");
    System.out.println(gdp);
    
    gdp = nation.getGDP("JAP");
    System.out.println(gdp);
 
    gdp = nation.getGDP("CHA");
    System.out.println(gdp);
    
    boolean sw = nation.check("KOR");
    System.out.println(sw);
    
    sw = nation.check("Kor"); // 대소문자 철저 구분
    System.out.println(sw);
 
  }
 
}