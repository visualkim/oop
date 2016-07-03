package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

class Server2 {
	public void execute() {
		ServerSocket server = null;
		Socket socket = null;
		
		BufferedReader br = null;
		
		try {
			server = new ServerSocket( 2010 );
			while( true ) {
				System.out.println( "접속자를 기다리는 중입니다" );
				socket = server.accept();	//	대기중1
				InetAddress inet = server.getInetAddress();
				System.out.println( "접속: " + inet.getHostAddress() );
				
				InputStream in = socket.getInputStream();
				Reader reader = new InputStreamReader( in );
				br = new BufferedReader( reader );
				String line = br.readLine();
				String[] str = line.split( "/" );
				for( int i = 0; i < str.length; i++ ) {
					System.out.println( str[i] );
				}
				
				br.close();
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				server.close();
			} catch (IOException e) {
				//e.printStackTrace();
			}
		}
	}
}
public class Server2Use {

	public static void main(String[] args) {
		Server2 server2 = new Server2();
		server2.execute();

	}

}
