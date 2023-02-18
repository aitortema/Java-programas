import java.util.Scanner;

public class VoltearCadena {
	public static void main(String[] args) {

		// ==================== OPCIONES
		char opcionUsuario;
		Scanner sc = new Scanner(System.in);
		String cadenaUsuario;

		do {

			System.out.println("¿Jugar a voltear una cadena? ");
			System.out.println("S/N");

			opcionUsuario = sc.next().charAt(0);

			if (opcionUsuario == 's') {
				System.out.println("=====================================");
				System.out.println("========= VOLTEAR UNA CADENA ========");
				System.out.println("=====================================");
				System.out.println("");
				System.out.println("Introduce la cadena: ");
				cadenaUsuario = sc.nextLine(); // ¡VACIAR BUFFER!
				cadenaUsuario = sc.nextLine(); // RECOGER CADENA USUARIO
				System.out.println("");

				System.out.println("La cadena invertida es:");
				for (int i = cadenaUsuario.length() - 1; i >= 0; i--) {
					System.out.print(cadenaUsuario.charAt(i));
				}
				System.out.println("");
			} else {
				System.out.println("¡Hasta otra!");
			}
		} while (opcionUsuario == 's');
	}
}
