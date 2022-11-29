package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	static final int MEDIA2=2;
	static final int MEDIA3=3;
	static double media (int a, int b) {
		double result;
		result = (a+b)/MEDIA2;
		return result;
	}
	static double media (int a, int b, int c) {
		double result;
		result= (a+b+c)/MEDIA3;
		return result;
	}

	public static void main(String[] args) {
		int num1, num2,num3;
		Scanner read= new Scanner (System.in);
		System.out.println("Introduzca dos números para saber la media.");
		num1=read.nextInt();
		num2=read.nextInt();
		num3=read.nextInt();
		System.out.println("La media de los dos números es "+ media(num1,num2));
		System.out.println("La media de los tres números es " + media (num1, num2, num3));
		
		read.close();
		

	}

}
