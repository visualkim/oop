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
			
			byte[] buffer = new byte[4096];	// �ѹ��� �ϰ� ����� �������� ũ��
			int count = 0;	// ���� ����Ʈ ��
			int readCount = 0;	// ���� ���� üũ
			
			while( true ) {
				Thread.sleep( 10 ); // 0.01�� - Thread ������ 0.01�ʰ� ����
				count = fis.read( buffer );	// Call By Reference
				
				if( count == -1 ) { break; }
				
				fos.write( buffer, 0, count );
				readCount++;	// ���� Ƚ�� ����
				
				if( readCount % 20 == 0 ) {
					System.out.println();
				} else {
					System.out.print( "#" );
				}
			}
			System.out.println();
			File file = new File( "C:/201605_java/backup/sw02.jpg" );
			if( file.exists() ) { 
				System.out.println( "���� ���� ����" ); 
			} else {
				System.out.println( "���� ���� ����" );
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

















