package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream( "C:/201605_java/swiss/sw02.jpg" );
			fos = new FileOutputStream( "C:/201605_java/backup/sw02.jpg" );
			
			byte[] buffer = new byte[4096];	// 한번에 일고 기록할 데이터의 크기
			int count = 0;	// 읽은 바이트 수
			int readCount = 0;	// 진행 사항 체크
			
			while( true ) {
				Thread.sleep( 10 ); // 0.01초 - Thread 실행을 0.01초간 중지
				count = fis.read( buffer );	// Call By Reference
				
				if( count == -1 ) { break; }
				
				fos.write( buffer, 0, count );
				readCount++;	// 읽은 횟수 증가
				
				if( readCount % 20 == 0 ) {
					System.out.println();
				} else {
					System.out.print( "#" );
				}
			}
			System.out.println();
			File file = new File( "C:/201605_java/backup/sw02.jpg" );
			if( file.exists() ) { 
				System.out.println( "파일 복사 성공" ); 
			} else {
				System.out.println( "파일 복사 실패" );
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( fos != null ) {
					fos.close();
				}
			} catch (Exception e ) {}
			
			try {
				if( fis != null ) {
					fis.close();
				}
			} catch (Exception e ) {}
		}
	}
}

















