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
				line = br.readLine();	//접속이 정상적이면 대기
				if( line == null ) {	//접속 해제시 null 읽음
					break;
				}
				System.out.println( line );
			}
		} catch( IOException e ) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				socket = null;	//GC메모리 수집을 빨리 진행하게 됨
				System.out.println( "접속해제 발생" );
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
				System.out.println( "접속자 기다리는 중" );
				socket = server.accept();	//대기중
				InetAddress inet = server.getInetAddress();
				System.out.println( "접속: " + inet.getHostAddress() );
				ReadThread rt = new ReadThread( socket );
				rt.start();
				
				users.add( rt );	//접속자 누적
				
				
				for( int i = 0; i < users.size(); i++ ) {
					ReadThread _rt = users.get( i );
					if( _rt.socket == null ) {	//연결해제 체크
						System.out.println( "접속자 연결해제" );
						users.remove( i );	//접속 해제된 사용자 목록에서 삭제
						users.trimToSize();	//저장소 크기 줄임
					}
				}
				System.out.println( "현재 접속자수: " + users.size() );
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
