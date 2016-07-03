package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

class Client1 {
	public void execute( String ip) {
		Socket socket = null;
		
		BufferedReader br = null;
		
		try {
			socket = new Socket( ip, 2010 );
			InetAddress inet = socket.getInetAddress();
			System.out.println( "서버IP: " + inet.getHostAddress() );
			
			InputStream in = socket.getInputStream();	//byte전송
			Reader reader = new InputStreamReader( in );
			br = new BufferedReader( reader );
			String line = br.readLine();
			String[] str = line.split( "/" );
			for( int i = 0; i < str.length; i++ ) {
				System.out.println( str[i] );
			}
			
			br.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
public class Client1Use {

	public static void main(String[] args) {
		Client1 client1 = new Client1();
		client1.execute( args[0] );
	}

}
