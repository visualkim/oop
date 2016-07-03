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
			System.out.println( "����IP: " + inet.getHostAddress() );
			
			OutputStream out = socket.getOutputStream();	//byte����
			Writer writer = new OutputStreamWriter( out );	//�ѱ� ��ȯ
			bw = new BufferedWriter( writer );	//�޸� ���
			bw.write( "[��ǻ�� ��õ]/����/SSD/15��ġ" );
			bw.flush();//����, Ŭ���� ����� �ڵ� ����
			
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
