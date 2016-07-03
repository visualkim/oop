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
			System.out.println( "����IP: " + inet.getHostAddress() );
			
			OutputStream out = socket.getOutputStream();	//byte����
			Writer writer = new OutputStreamWriter( out );	//�ѱ� ��ȯ
			bw = new BufferedWriter( writer );	//�޸� ���
			Random rnd = new Random();
			
			while( true ) {
				Thread.sleep( 2000 );	//2�ʰ� ����
				int temp = rnd.nextInt( 61 ) - 30;	// -30 ~ 30
				System.out.println( "���� �µ�: " + temp );
				String localIp = InetAddress.getLocalHost().getHostAddress();
				bw.write( localIp + ": " + temp );
				bw.newLine();// Enter����
				bw.flush();
				
				if( temp == -30 ) {
					break;
				}
			}
			socket.close();
			
		} catch (UnknownHostException e) {
			// ���� ��ǻ�Ͱ� ���� ���
			e.printStackTrace();
		} catch (IOException e) {
			//���ӵ� ���� ����� ����
			e.printStackTrace();
		} catch (InterruptedException e) {	
			// ����� ���� �������� ������ ������ ����� 
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
