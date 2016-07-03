package oop3;

class Two extends Thread{
	private String name;
	
	public Two( String name ) {
		this.name = name;
	}

	@Override
	public void run() {
		//super.run();
		for( int i = 0; i < 5; i ++ ) {
			System.out.println( i + ": " + name );
		}
	}
}
public class Thread2 {

	public static void main(String[] args) {
		Two two1 = new Two( "캐리어 공격" );
		two1.start();	// start() -> JVM -> run();
		
		Two two2 = new Two( "드라군 공격" );
		two2.start();
		
		Two two3 = new Two( "스카우트 공격" );
		two3.start();
	}

}
