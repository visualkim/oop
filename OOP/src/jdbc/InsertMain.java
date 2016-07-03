package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class Insert {
	public void execute() {
		Connection con = null;			// DBMS 연결
	    PreparedStatement pstmt = null;	// SQL 실행
	    ResultSet rs = null;			// SELECT 결과를 저장
	    StringBuffer sql = null;		// SQL 문장
	    int count = 0;					// 처리된 레코드 갯수
	 
	    String className = "org.gjt.mm.mysql.Driver"; // MySQL 연결 Drvier 
	    String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr"; 
	    String user = "root"; 
	    String pass = "1234";
	 
	    try{
	      Class.forName(className); // memory로 클래스를 로딩함, 객체는 생성하지 않음.
	      con = DriverManager.getConnection(url, user, pass); // MySQL 연결

	      sql = new StringBuffer();
	      sql.append(" INSERT INTO news2(title, rdate)");
	      sql.append(" VALUES('Web 개발', now());");

	 
	      pstmt = con.prepareStatement(sql.toString());
	      count = pstmt.executeUpdate();	// INSERT, UPDATE, DELETE
	      // rs = pstmt.executeQuery();		// SELECT 
	 
	      if (count == 1){
	        System.out.println("처리 성공");
	      }else{
	        System.out.println("처리 실패");
	      }    
	    }catch(Exception e){
	      e.printStackTrace();
	    }finally{
//	      try{
//	        if (rs != null){ rs.close(); }
//	      }catch(Exception e){ }
	 
	      try{
	        if (pstmt != null){ pstmt.close(); }
	      }catch(Exception e){ }
	 
	      try{
	        if (con != null){ con.close(); }
	      }catch(Exception e){ }
	    }
	}
	public void execute( String title ) {
		Connection con = null;			// DBMS 연결
	    PreparedStatement pstmt = null;	// SQL 실행
	    ResultSet rs = null;			// SELECT 결과를 저장
	    StringBuffer sql = null;		// SQL 문장
	    int count = 0;					// 처리된 레코드 갯수
	 
	    String className = "org.gjt.mm.mysql.Driver"; // MySQL 연결 Drvier 
	    String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr"; 
	    String user = "root"; 
	    String pass = "1234";
	 
	    try{
	      Class.forName(className); // memory로 클래스를 로딩함, 객체는 생성하지 않음.
	      con = DriverManager.getConnection(url, user, pass); // MySQL 연결

	      sql = new StringBuffer();
	      sql.append(" INSERT INTO news2(title, rdate)");
	      sql.append(" VALUES(?, now());");

	 
	      pstmt = con.prepareStatement(sql.toString());
	      pstmt.setString( 1,  title );
	      count = pstmt.executeUpdate();	// INSERT, UPDATE, DELETE
	      // rs = pstmt.executeQuery();		// SELECT 
	 
	      if (count == 1){
	        System.out.println("처리 성공");
	      }else{
	        System.out.println("처리 실패");
	      }    
	    }catch(Exception e){
	      e.printStackTrace();
	    }finally{
//	      try{
//	        if (rs != null){ rs.close(); }
//	      }catch(Exception e){ }
	 
	      try{
	        if (pstmt != null){ pstmt.close(); }
	      }catch(Exception e){ }
	 
	      try{
	        if (con != null){ con.close(); }
	      }catch(Exception e){ }
	    }
	}
	public void execute( News2VO vo ) {
		Connection con = null;			// DBMS 연결
	    PreparedStatement pstmt = null;	// SQL 실행
	    ResultSet rs = null;			// SELECT 결과를 저장
	    StringBuffer sql = null;		// SQL 문장
	    int count = 0;					// 처리된 레코드 갯수
	 
	    String className = "org.gjt.mm.mysql.Driver"; // MySQL 연결 Drvier 
	    String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr"; 
	    String user = "root"; 
	    String pass = "1234";
	 
	    try{
	      Class.forName(className); // memory로 클래스를 로딩함, 객체는 생성하지 않음.
	      con = DriverManager.getConnection(url, user, pass); // MySQL 연결

	      sql = new StringBuffer();
	      sql.append(" INSERT INTO news2(title, rdate)");
	      sql.append(" VALUES(?, now());");

	 
	      pstmt = con.prepareStatement(sql.toString());
	      pstmt.setString( 1,  vo.getTitle() );
	      count = pstmt.executeUpdate();	// INSERT, UPDATE, DELETE
	      // rs = pstmt.executeQuery();		// SELECT 
	 
	      if (count == 1){
	        System.out.println("처리 성공");
	      }else{
	        System.out.println("처리 실패");
	      }    
	    }catch(Exception e){
	      e.printStackTrace();
	    }finally{
//	      try{
//	        if (rs != null){ rs.close(); }
//	      }catch(Exception e){ }
	 
	      try{
	        if (pstmt != null){ pstmt.close(); }
	      }catch(Exception e){ }
	 
	      try{
	        if (con != null){ con.close(); }
	      }catch(Exception e){ }
	    }
	}
}

public class InsertMain {

	public static void main(String[] args) {
		Insert insert = new Insert();
//		insert.execute();
//		insert.execute( "급여 시스템 개발" );
		
		News2VO vo = new News2VO();
		vo.setTitle( "JDBC개발" );
		insert.execute( vo );
		
	}

}
