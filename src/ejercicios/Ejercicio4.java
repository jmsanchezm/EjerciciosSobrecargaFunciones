package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	static int parseToBoolean (int num) {
		int result;
		if (num==0 && num==1) {
			result = num == 0? "FALSE": "TRUE";
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
		cadena=read.nextLine();
		
		

	}

}
