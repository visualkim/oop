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
			System.out.println( "폴더 생성: " + dir.mkdir() );
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
					System.out.println( line ); // 화면출력
					pw.println( line );
				}
			}
			pw.flush(); // 파일기록 수행
			
			if( backup.exists() ) {
				System.out.println( "백업이 완료되었습니다"  );
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




