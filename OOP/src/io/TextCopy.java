package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextCopy {

	public static void main(String[] args) {

		File dir = new File( "C:/201605_java/backup" );
		if( dir.exists() == false ) {
			System.out.println( "���� ����: " + dir.mkdir() );
		}
		
		File file = new File( "C:/201605_java/news.txt" );
		File backup = new File( "C:/201605_java/backup/news.txt" );
		
		try {
			BufferedReader br = new BufferedReader( new FileReader( file ) );
			PrintWriter pw = new PrintWriter( new FileWriter( backup, true ));
			String line = "";
			
			while( true ) {
				line = br.readLine();
				if( line == null ) {
					break;
				} else {
					System.out.println( line ); // ȭ�����
					pw.println( line );
				}
			}
			pw.flush(); // ���ϱ�� ����
			
			if( backup.exists() ) {
				System.out.println( "����� �Ϸ�Ǿ����ϴ�"  );
			}
			br.close();
			pw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}




