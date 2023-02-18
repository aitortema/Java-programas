import java.util.Scanner;

public class NumParImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numUsuario;

		// ================ PROGRAMA
		System.out.println("====================");
		System.out.println("¿NÚMERO PAR O IMPAR?");
		System.out.println("====================");
		System.out.println("Introduce un número ENTERO: ");

		numUsuario = sc.nextInt();

		if (numUsuario % 2 == 0) {
			System.out.println("El " + numUsuario + " es PAR. ");
		} else {
			System.out.println("El " + numUsuario + " es IMPAR. ");
		}

	}

}
