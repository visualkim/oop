package oop;

public class Movie {
	public void print(String name) {
		System.out.println("��ȭ��: " + name);
		System.out.println("====================");
	}
	public void print(String name, String type) {
		System.out.println("��ȭ��: " + name);
		System.out.println("�帣: " + type);
		System.out.println("====================");
	}
	public void print(String name, String type, int runtime) {
		System.out.println("��ȭ��: " + name);
		System.out.println("�帣: " + type);
		System.out.println("�ð�: " + runtime);
		System.out.println("====================");
	}
	public void print(String name, String[] actors) {
		System.out.println("��ȭ��: " + name);
		System.out.print("�����ι�: ");
		for( int index = 0; index < actors.length; index++ ) {
			//System.out.print(actors[index]);
			if( index == 0 ) {
				System.out.print(actors[index]);
			} else {
				System.out.print("/" + actors[index]);
			}		
		}	
		System.out.println("----------------------");
		for( int index = 0; index < actors.length; index++ ) {
			System.out.print(actors[index]);
			if( index < actors.length -1 ) {
				System.out.print(" / ");
			}
			
		}
		System.out.println("----------------------");
		for( int index = 0; index < actors.length; index++ ) {
			System.out.print(actors[index]);
			if( index + 1 < actors.length ) {
				System.out.print(" / ");
			}
			
		}
	}

}
