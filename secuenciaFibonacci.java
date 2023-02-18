package programasSencillos;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		// 0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597
		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		int n2 = 1;
		int suma = 0;
		int cantidadNumerosDeLaSerie = 0;

		// TÍTULO
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^^^^^^^^^ FIBONACCI ^^^^^^^^^");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("");

		// PROGRAMA
		System.out.println("¿Cuántos números quieres obtener?");
		cantidadNumerosDeLaSerie = sc.nextInt();
		System.out.println("Has elegido una serie de Fibonacci de " + cantidadNumerosDeLaSerie + " números.\n");
		System.out.println(n1);
		System.out.println(n2);

		for (int i = 1; i < cantidadNumerosDeLaSerie - 1; i++) {
			suma = n1 + n2;
			System.out.println(suma);
			n1 = n2;
			n2 = suma;

		}
	}
}
