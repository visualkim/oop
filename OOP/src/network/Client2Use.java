package network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

class Client2 {
	public void execute( String ip ) {
		Socket socket = null;
		
		BufferedWriter bw = null;
		
		try {
			socket = new Socket( ip, 2010 );
			InetAddress inet = socket.getInetAddress();
			System.out.println( "서버IP: " + inet.getHostAddress() );
			
			OutputStream out = socket.getOutputStream();	//byte전송
			Writer writer = new OutputStreamWriter( out );	//한글 변환
			bw = new BufferedWriter( writer );	//메모리 기록
			bw.write( "[컴퓨터 추천]/쿼드/SSD/15인치" );
			bw.flush();//전송, 클래스 종료시 자동 전송
			
			bw.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
public class Client2Use {

	public static void main(String[] args) {
		Client2 client2 = new Client2();
		client2.execute( args[0] );
	}

}
