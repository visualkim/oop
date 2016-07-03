package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class Insert {
	public void execute() {
		Connection con = null;			// DBMS ����
	    PreparedStatement pstmt = null;	// SQL ����
	    ResultSet rs = null;			// SELECT ����� ����
	    StringBuffer sql = null;		// SQL ����
	    int count = 0;					// ó���� ���ڵ� ����
	 
	    String className = "org.gjt.mm.mysql.Driver"; // MySQL ���� Drvier 
	    String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr"; 
	    String user = "root"; 
	    String pass = "1234";
	 
	    try{
	      Class.forName(className); // memory�� Ŭ������ �ε���, ��ü�� �������� ����.
	      con = DriverManager.getConnection(url, user, pass); // MySQL ����

	      sql = new StringBuffer();
	      sql.append(" INSERT INTO news2(title, rdate)");
	      sql.append(" VALUES('Web ����', now());");

	 
	      pstmt = con.prepareStatement(sql.toString());
	      count = pstmt.executeUpdate();	// INSERT, UPDATE, DELETE
	      // rs = pstmt.executeQuery();		// SELECT 
	 
	      if (count == 1){
	        System.out.println("ó�� ����");
	      }else{
	        System.out.println("ó�� ����");
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
		Connection con = null;			// DBMS ����
	    PreparedStatement pstmt = null;	// SQL ����
	    ResultSet rs = null;			// SELECT ����� ����
	    StringBuffer sql = null;		// SQL ����
	    int count = 0;					// ó���� ���ڵ� ����
	 
	    String className = "org.gjt.mm.mysql.Driver"; // MySQL ���� Drvier 
	    String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr"; 
	    String user = "root"; 
	    String pass = "1234";
	 
	    try{
	      Class.forName(className); // memory�� Ŭ������ �ε���, ��ü�� �������� ����.
	      con = DriverManager.getConnection(url, user, pass); // MySQL ����

	      sql = new StringBuffer();
	      sql.append(" INSERT INTO news2(title, rdate)");
	      sql.append(" VALUES(?, now());");

	 
	      pstmt = con.prepareStatement(sql.toString());
	      pstmt.setString( 1,  title );
	      count = pstmt.executeUpdate();	// INSERT, UPDATE, DELETE
	      // rs = pstmt.executeQuery();		// SELECT 
	 
	      if (count == 1){
	        System.out.println("ó�� ����");
	      }else{
	        System.out.println("ó�� ����");
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
		Connection con = null;			// DBMS ����
	    PreparedStatement pstmt = null;	// SQL ����
	    ResultSet rs = null;			// SELECT ����� ����
	    StringBuffer sql = null;		// SQL ����
	    int count = 0;					// ó���� ���ڵ� ����
	 
	    String className = "org.gjt.mm.mysql.Driver"; // MySQL ���� Drvier 
	    String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr"; 
	    String user = "root"; 
	    String pass = "1234";
	 
	    try{
	      Class.forName(className); // memory�� Ŭ������ �ε���, ��ü�� �������� ����.
	      con = DriverManager.getConnection(url, user, pass); // MySQL ����

	      sql = new StringBuffer();
	      sql.append(" INSERT INTO news2(title, rdate)");
	      sql.append(" VALUES(?, now());");

	 
	      pstmt = con.prepareStatement(sql.toString());
	      pstmt.setString( 1,  vo.getTitle() );
	      count = pstmt.executeUpdate();	// INSERT, UPDATE, DELETE
	      // rs = pstmt.executeQuery();		// SELECT 
	 
	      if (count == 1){
	        System.out.println("ó�� ����");
	      }else{
	        System.out.println("ó�� ����");
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
//		insert.execute( "�޿� �ý��� ����" );
		
		News2VO vo = new News2VO();
		vo.setTitle( "JDBC����" );
		insert.execute( vo );
		
	}

}
