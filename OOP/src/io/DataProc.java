package io;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
 
public class DataProc {
 
  public static void main(String[] args) {
    File data = new File("C:/201605_java/data.txt"); // �ҽ�
    File proc = new File("C:/201605_java/data_proc.txt"); // ó�� ���
    
    try {
      FileReader reader = new FileReader(data); // Call By Reference
      BufferedReader br = new BufferedReader(reader);
      //BufferedReader br = new BufferedReader( new FileReader( data ) );
      
      FileWriter fw = new FileWriter(proc, false); // false: ���� ���� ���� �� ���
      PrintWriter pw = new PrintWriter(fw);
      //PrintWriter pw = new PrintWriter( new FileWriter( proc, false ) );
      
      String line = ""; 
      
      while(true){
        line = br.readLine();
 
        if (line == null){ // ���� ��
          break;
        }else{
          String[] str = line.split(",");
          String name = str[0];
          int java = Integer.parseInt(str[1]);
          int html5 = Integer.parseInt(str[2]);
          int css3 = Integer.parseInt(str[3]);           
          int tot = java + html5 + css3;
          int avg = tot / 3;
          
          pw.println( "����: " + name );
		  pw.println( "JAVA: " + java );
		  pw.println( "CSS3: " + css3 );
		  pw.println( "����: " + tot );
		  pw.println( "���: " + avg );
		  pw.println( "----------------------" );
		  
        }
      }
      pw.flush(); // ���� ���Ͽ� ���
      
      if (proc.exists()){
        System.out.println("ó���� �Ϸ�Ǿ����ϴ�.");
      }
      
      /*����: �մ���
      JAVA: 80
      HTML5: 90
      CSS3: 100
      ����: 270
      ���: 90
      ------------------ 
      .....*/
      
      br.close();
      reader.close();
      pw.close();
      fw.close();
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }
 
}
 