package io;

import java.io.File;

public class Folder {

	public static void main(String[] args) {
		File folder = new File("C:/201605_java/test" );
		System.out.println( "폴더생성: " + folder.mkdir() );
		
		File src = new File( "C:/201605_java/test" );
		File dest = new File( "C:/201605_java/test2" );
		System.out.println( "폴더명 변경: " + src.renameTo(dest) );
				
		File del = new File( "C:/201605_java/test2" );
		if( del.delete() ) {
			System.out.println( "폴더를 삭제하였습니다." );
		} else {
			System.out.println( "폴더 삭제에 실패했습니다." );
		}
		System.out.println( "------------------------" );
		
		
		
		
		
		
		
		File dirSwiss = new File( "C:/201605_java/swiss" );
		File[] files = dirSwiss.listFiles();
		
		
		for( int i = 0; i < files.length; i++ ) {
			File file = files[i];			
						
			System.out.print( file.getName() );
			System.out.println(" (" + Tool.unit(file.length()) + ")");	
		}
		
		
	}

}
















