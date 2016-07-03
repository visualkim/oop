package network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

class Server1 {
	public void execute() {
		ServerSocket server = null;
		Socket socket = null;
		
		BufferedWriter bw = null;
		
		try {
			server = new ServerSocket( 2010 );
			while( true ) {
				System.out.println( "�����ڸ� ��ٸ��� ���Դϴ�" );
				socket = server.accept();	//	�����1
				InetAddress inet = server.getInetAddress();
				System.out.println( "����: " + inet.getHostAddress() );
				
				OutputStream out = socket.getOutputStream();	//byte����
				Writer writer = new OutputStreamWriter( out );	//�ѱ� ��ȯ
				bw = new BufferedWriter( writer );	//�޸� ���
				bw.write( "[�̵���õ]/24/Agent of Shield/Agent Carter/Daredevil" );
				bw.flush();//����, Ŭ���� ����� �ڵ� ����
				
				bw.close();
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
public class Server1Use {

	public static void main(String[] args) {
		Server1 server1 = new Server1();
		server1.execute();

	}

}
