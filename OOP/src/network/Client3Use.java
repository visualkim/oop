package network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;

class Client3 {
	public void execute( String ip ) {
		Socket socket = null;
		BufferedWriter bw = null;
		
		try {
			socket = new Socket( ip,  2010 );
			InetAddress inet = socket.getInetAddress();
			System.out.println( "서버IP: " + inet.getHostAddress() );
			
			OutputStream out = socket.getOutputStream();	//byte전송
			Writer writer = new OutputStreamWriter( out );	//한글 변환
			bw = new BufferedWriter( writer );	//메모리 기록
			Random rnd = new Random();
			
			while( true ) {
				Thread.sleep( 2000 );	//2초간 중지
				int temp = rnd.nextInt( 61 ) - 30;	// -30 ~ 30
				System.out.println( "현재 온도: " + temp );
				String localIp = InetAddress.getLocalHost().getHostAddress();
				bw.write( localIp + ": " + temp );
				bw.newLine();// Enter전송
				bw.flush();
				
				if( temp == -30 ) {
					break;
				}
			}
			socket.close();
			
		} catch (UnknownHostException e) {
			// 접속 컴퓨터가 없는 경우
			e.printStackTrace();
		} catch (IOException e) {
			//접속된 후의 입출력 예외
			e.printStackTrace();
		} catch (InterruptedException e) {	
			// 깨어나지 못해 오랫동안 정지된 쓰레드 존재시 
			e.printStackTrace();
		}		
	}
}
public class Client3Use {

	public static void main(String[] args) {
		Client3 client = new Client3();
		client.execute( args[0] );
	}

}
