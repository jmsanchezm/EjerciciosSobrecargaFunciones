package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	static int sumaInt(int a , int b) {
		int result=0;
		result=a+b;
		return (result);
	}
	static double sumaDouble (double a, double b) {
		double result = 0 ;
		result=a+b;
		return (result);
	}

	public static void main(String[] args) {
		int num1, num2;
		double numero1, numero2;
		int result1;
		double result2;
		
		Scanner read= new Scanner (System.in);
		
		System.out.println("Introduzca dos valores, enteros o no:");
		num1=read.nextInt();
		num2=read.nextInt();
		numero1=read.nextDouble();
		numero2=read.nextDouble();
		
		System.out.println(result1= sumaInt(num1, num2));
		System.out.println(result2=sumaDouble(numero1, numero2));
		
		read.close();

	}

}
