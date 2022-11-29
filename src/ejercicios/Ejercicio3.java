package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	static int sumaEntero(int num){
		int suma=0;
		for (int i = 1; i<=num;i++) {
			suma+=i;
		}
		return suma;
	}
	static int sumaEntero(int a, int b) {
		int suma =0;
		for (int i = a; i<=b; i++) {
			suma+=i;
		}
		return suma;
	}
	public static void main(String[] args) {
		int num1, num2;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduzca dos números: ");
		num1=read.nextInt();
		num2=read.nextInt();
		int menor =num1<num2? num1:num2;
		int mayor = num1>num2?num1:num2;
		System.out.println(sumaEntero(num1));
		System.out.println(sumaEntero(menor, mayor));
		
		read.close();
		

	}

}
