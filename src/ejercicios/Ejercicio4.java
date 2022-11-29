package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	static boolean parseToBoolean(String cad) {
		boolean result = false;
		if (cad.equals("true"))
			result=true;
		else
			result=false;
			
		return result;
	}
	static boolean parseToBoolean (int num) {
		boolean result=true;
		switch(num) {
		case 0->
			result=false;
		case 1->
			result=true;
		default->
			System.out.println("ERROR");	
		}
		return result;
	}

	public static void main(String[] args) {
		int num;
		String cadena;
		Scanner read= new Scanner (System.in);
		System.out.println("Introduzca un 0 o un 1:");
		num=read.nextInt();
		System.out.println("Introduzca 'true' o 'false':");
		cadena=read.next();
		cadena=cadena.toLowerCase();
		
		System.out.println(parseToBoolean(num));
		System.out.println(parseToBoolean(cadena));
		read.close();
		
		

	}

}
