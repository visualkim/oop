package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class PayProc {

	public static void main(String[] args) {
		File file = new File( "C:/201605_java/pay.txt" );
		File proc = new File( "C:/201605_java/pay_proc.txt" );
		
		try {
			FileReader fr = new FileReader( file );
			BufferedReader br = new BufferedReader( fr );
			
			FileWriter fw = new FileWriter( proc );
			PrintWriter pw = new PrintWriter( fw );
			
			String line = "";
			DecimalFormat df = new DecimalFormat( "#,###,###원" );
			
			while( true ) {
				line = br.readLine();
				
				if( line == null ) {
					break;
				} else {
					String[] str = line.split( "," );
					String name = str[0];
					double pay = Double.parseDouble( str[1] );
					int career = Integer.parseInt(str[2]);
					double salary = pay * 13;
					
					
					pw.println( "성명: " + name );
					pw.println( "급여: " + df.format( pay ) );
					pw.println( "경력: " + career );
					pw.println( "연봉: " + df.format( salary ) );
					pw.println( "------------------" );
					
				}				
			}
			pw.flush();
			
			if( proc.exists() ) {
				System.out.println( "처리가 완료되었습니다" );
			}
			fr.close();
			br.close();
			fw.close();
			pw.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
