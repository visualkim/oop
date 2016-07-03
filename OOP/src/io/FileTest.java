package io;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("C:/201605_java/swiss/sw01.jpg");
		
		if( file.exists() == true ) {
			System.out.println("파일이 존재합니다.");
			
		} else { 
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		// 순수 파일명: jdk-8u74-windows-x64.exe		
		System.out.println( file.getName() );
		
		// 파일의 길이: 196405336
		System.out.println( file.length() );
		
		// 전체 경로:
		System.out.println( file.getAbsolutePath() );
		
		// 상위 폴더:
		System.out.println( file.getParent() );
		
		// 파일인지 검사:
		System.out.println( file.isFile() );
		
		// 파일명 변경
		File src = new File("C:/201605_java/swiss/sw01.jpg");
		File dest = new File("C:/201605_java/swiss/sw01_x.jpg");
		System.out.println( file.renameTo(dest) );
		
		// 파일 삭제
		File del = new File("C:/201605_java/swiss/sw01.jpg");
		System.out.println( del.delete() );
		
		// 이미지 파일입니다.
		File img = new File("C:/201605_java/swiss/sw02.jpg");
		System.out.println( img.getName() );
		String name = img.getName();
		name = name.toLowerCase();
		if( name.endsWith(".jpg") || name.endsWith(".png") || name.endsWith(".gif") ) {
			System.out.println("이미지 파일입니다.");
		}
		
		File file2 = new File("C:/201605_java/swiss/data.txt");
		
		try {
			System.out.println("파일 생성: " + file2.createNewFile() );
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File source = new File("C:/201605_java/swiss/sw02.jpg");
		File destination = new File("C:/201605_java/swiss/temp/sw02.jpg");
		source.renameTo(destination);
		if(destination.exists()) {
			System.out.println("파일이 이동되었습니다.");
		}

	}

}


















