import java.util.Scanner;

public class JavaRecursividad {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rangoMin = 0;
		int rangoMax = 0;

		// =================== PROGRAMA

		System.out.println("Introduce el rango mínimo. ");
		rangoMin = sc.nextInt();
		System.out.println("Introduce el rango máximo. ");
		rangoMax = sc.nextInt();

		System.out.println("La suma de los números desde " + rangoMin + " hasta " + rangoMax + " es: ");
		int resultado = sumar(rangoMin, rangoMax);
		System.out.println(resultado);
	}

	public static int sumar(int numInicial, int numFinal) {

		if (numFinal > numInicial) {
			return numFinal + sumar(numInicial, numFinal - 1);
		} else {
			return numFinal;
		}
	}
}
