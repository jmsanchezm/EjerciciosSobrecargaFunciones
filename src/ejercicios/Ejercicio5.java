package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	static double numerosAleatorios (int num) {
		double result=0;
		for(int i = 1; i<num;i++) {
			result=Math.random();
			System.out.println(result);
		}
		return result;
	} 
	public static void main(String[] args) {
		int numVeces;
		Scanner read= new Scanner (System.in);
		System.out.println("Introduzca el número de veces que quiera generar un número:");
		numVeces=read.nextInt();
		System.out.println(numerosAleatorios(numVeces));
		

	}

}
