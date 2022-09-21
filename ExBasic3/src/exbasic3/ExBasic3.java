package exbasic3;

import java.util.Scanner;

public class ExBasic3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Introduzca el año actual y pulse Intro");
		int actyear= sc.nextInt();
		System.out.println();
		System.out.println("Introduzca su año de nacimiento y pulse Intro");
		int birthyear= sc.nextInt();
		System.out.println();
		
	
		int edad= actyear-birthyear;
		System.out.println("Su edad es de "+edad+" años.");
		sc.close();
		


	}

}
