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
				System.out.println( "접속자를 기다리는 중입니다" );
				socket = server.accept();	//	대기중1
				InetAddress inet = server.getInetAddress();
				System.out.println( "접속: " + inet.getHostAddress() );
				
				OutputStream out = socket.getOutputStream();	//byte전송
				Writer writer = new OutputStreamWriter( out );	//한글 변환
				bw = new BufferedWriter( writer );	//메모리 기록
				bw.write( "[미드추천]/24/Agent of Shield/Agent Carter/Daredevil" );
				bw.flush();//전송, 클래스 종료시 자동 전송
				
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
