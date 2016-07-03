package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

class ReadThread extends Thread {
	Socket socket = null;
	
	public ReadThread( Socket socket ) {
		this.socket = socket;
	}
	@Override
	public void run() {
		//super.run();
		String line = null;
		BufferedReader br = null;
		
		try {
			InputStream in = socket.getInputStream();
			Reader reader = new InputStreamReader( in );
			br = new BufferedReader( reader );
			
			while( true ) {
				line = br.readLine();	//������ �������̸� ���
				if( line == null ) {	//���� ������ null ����
					break;
				}
				System.out.println( line );
			}
		} catch( IOException e ) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				socket = null;	//GC�޸� ������ ���� �����ϰ� ��
				System.out.println( "�������� �߻�" );
			} catch( Exception e ) {
				
			}
		}
	}
	
}
class Server3 {
	public void execute() {
		ServerSocket server = null;
		Socket socket = null;
		
		Vector<ReadThread> users = new Vector<ReadThread>();
		
		try {
			server = new ServerSocket( 2010 );
			while( true ) {
				System.out.println( "������ ��ٸ��� ��" );
				socket = server.accept();	//�����
				InetAddress inet = server.getInetAddress();
				System.out.println( "����: " + inet.getHostAddress() );
				ReadThread rt = new ReadThread( socket );
				rt.start();
				
				users.add( rt );	//������ ����
				
				
				for( int i = 0; i < users.size(); i++ ) {
					ReadThread _rt = users.get( i );
					if( _rt.socket == null ) {	//�������� üũ
						System.out.println( "������ ��������" );
						users.remove( i );	//���� ������ ����� ��Ͽ��� ����
						users.trimToSize();	//����� ũ�� ����
					}
				}
				System.out.println( "���� �����ڼ�: " + users.size() );
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
public class Server3Use {

	public static void main(String[] args) {
		Server3 server = new Server3();
		server.execute();
	}

}
