package io;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("C:/201605_java/swiss/sw01.jpg");
		
		if( file.exists() == true ) {
			System.out.println("������ �����մϴ�.");
			
		} else { 
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		
		// ���� ���ϸ�: jdk-8u74-windows-x64.exe		
		System.out.println( file.getName() );
		
		// ������ ����: 196405336
		System.out.println( file.length() );
		
		// ��ü ���:
		System.out.println( file.getAbsolutePath() );
		
		// ���� ����:
		System.out.println( file.getParent() );
		
		// �������� �˻�:
		System.out.println( file.isFile() );
		
		// ���ϸ� ����
		File src = new File("C:/201605_java/swiss/sw01.jpg");
		File dest = new File("C:/201605_java/swiss/sw01_x.jpg");
		System.out.println( file.renameTo(dest) );
		
		// ���� ����
		File del = new File("C:/201605_java/swiss/sw01.jpg");
		System.out.println( del.delete() );
		
		// �̹��� �����Դϴ�.
		File img = new File("C:/201605_java/swiss/sw02.jpg");
		System.out.println( img.getName() );
		String name = img.getName();
		name = name.toLowerCase();
		if( name.endsWith(".jpg") || name.endsWith(".png") || name.endsWith(".gif") ) {
			System.out.println("�̹��� �����Դϴ�.");
		}
		
		File file2 = new File("C:/201605_java/swiss/data.txt");
		
		try {
			System.out.println("���� ����: " + file2.createNewFile() );
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File source = new File("C:/201605_java/swiss/sw02.jpg");
		File destination = new File("C:/201605_java/swiss/temp/sw02.jpg");
		source.renameTo(destination);
		if(destination.exists()) {
			System.out.println("������ �̵��Ǿ����ϴ�.");
		}

	}

}


















