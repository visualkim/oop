package oop2;

import java.util.Scanner;


public class InputTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�����ȣ : ");
		//int sano = scan.nextInt();
		int sano = Integer.parseInt(scan.nextLine());
		
		
		System.out.print("������� : ");
		String job = scan.nextLine();
		
		System.out.println("-------------------------------");
		System.out.println(sano);
		System.out.println(job);

	}

}
