package jdbc;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
class Update{
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
	      sql.append(" UPDATE news2");
	      sql.append(" SET title='���� �ؼ�����'");
	      sql.append(" WHERE news2no=2" );

	 
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
	public void execute( int news2no, String title ) {
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
	      sql.append(" UPDATE news2");
	      sql.append(" SET title=?");
	      sql.append(" WHERE news2no=?" );

	 
	      pstmt = con.prepareStatement(sql.toString());
	      pstmt.setString( 1, title );
	      pstmt.setInt( 2, news2no );
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
	      sql.append(" UPDATE news2");
	      sql.append(" SET title=?");
	      sql.append(" WHERE news2no=?" );

	 
	      pstmt = con.prepareStatement(sql.toString());
	      pstmt.setString( 1, vo.getTitle() );
	      pstmt.setInt( 2, vo.getNews2no() );
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
 
public class UpdateMain {
  public static void main(String[] args) {
    Update update = new Update();
//    update.execute();
//    update.execute(4, "û���");
    News2VO vo = new News2VO();
    vo.setNews2no(3);
    vo.setTitle("�׳��");
    
    update.execute(vo);
 
  }
 
}