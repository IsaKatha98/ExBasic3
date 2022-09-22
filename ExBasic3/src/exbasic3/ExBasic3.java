package exbasic3;

import java.util.Scanner;

public class ExBasic3 {

	public static void main(String[] args) {
		
		//Le pedimos que introduzca el año actual
		System.out.print("Introduzca el año actual y pulse Intro: ");
		
		//Creamos el escáner
		Scanner sc= new Scanner (System.in);
		
		//Declaramos la variable actyear donde se guarda el año actual
		int actyear;
		actyear= sc.nextInt();
		
		//Le pedimos que introduzca el año de nacimiento
		System.out.print("Introduzca su año de nacimiento y pulse Intro: ");
		
		//Declaramos la variable birthyear donde se guarda el año de nacimiento 
		int birthyear;
		birthyear=sc.nextInt();
	
		//Declaramos la variable edad que es la resta del año actual menos el año de nacimiento
		int edad= actyear-birthyear;
		
		//Mostramos el resultado en la consola
		System.out.println("Su edad es de "+edad+" años.");
		
		//Cerramos el escáner
		sc.close();
		
	}

}
