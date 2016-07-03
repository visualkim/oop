package jdbc;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
class Delete{
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
	      sql.append(" DELETE FROM news2");
	      sql.append(" WHERE news2no=2" );

	 
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
	public void execute( int news2no ) {
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
	      sql.append(" DELETE FROM news2");
	      sql.append(" WHERE news2no=?" );

	 
	      pstmt = con.prepareStatement(sql.toString());
	      pstmt.setInt( 1, news2no );
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
 
public class DeleteMain {
  public static void main(String[] args) {
    Delete delete = new Delete();
//    delete.execute();
    delete.execute(6);
 
  }
 
}