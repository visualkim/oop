package oop3;

interface Developer {
	public abstract void aaa();
	public abstract void bbb();
	public abstract void ccc();
}
class Developerlmpl implements Developer {
	@Override
	public void aaa() {
		System.out.println( "Java Web ������" );
	}
	@Override
	public void bbb() {
		System.out.println( "JAVA, HTML5, JSP, Spring" );
	}
	@Override
	public void ccc() {
		System.out.println( "Blog ������Ʈ" );
	}
}

public class DeveloperUse {

	public static void main(String[] args) {
		Developer dev = new Developerlmpl();
		dev.aaa();
		dev.bbb();
		dev.ccc();
	}

}
