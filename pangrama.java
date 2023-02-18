import java.util.Scanner;

public class Pangrama {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String fraseUsuario = "";

		System.out.println(" ========================= ");
		System.out.println(" = THE PANGRAM ADVENTURE = ");
		System.out.println(" ========================= ");
		System.out.println(" ============ by Aitor === ");
		System.out.println("");
		System.out.println("Un pangrama incluye todas las letras de un alfabeto.");
		System.out.println("Escribe una frase para ver si es un pangrama y pulsa ENTER. ");
		fraseUsuario = sc.nextLine();
		comprobar(fraseUsuario);
	}

	// COMPROBAR SI FRASE USUARIO ES UN PANGRAMA
	public static void comprobar(String fraseUsuario) {

		char[] abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int contador = 0;

		System.out.println("");
		System.out.println("Cargando frase ." + "....... " + fraseUsuario.substring(0, 13) + "...");
		System.out.println("Comprobando frase ........ 100%");
		System.out.println("");
		// Pasar a minúsculas
		fraseUsuario = fraseUsuario.toLowerCase();

		// Aplico regex para limpiar la frase del usuario incluyendo tildes
		fraseUsuario = fraseUsuario.replaceAll("[^a-záéíóúñ]", "");
		System.out.println("Tu frase procesada es: " + fraseUsuario);

		// Eliminar caracteres repetidos
		// (.) captura todo individualmente
		// (?=.*\\1) buscar caracter y comparar con la captura
		fraseUsuario = fraseUsuario.replaceAll("(.)(?=.*\\1)", "");
		// LA EXPRESIÓN REGULAR SE COME LA Ñ DEL ABECEDARIO Y ME CAGO EN TODDO
		System.out.println("Tu frase sin caracteres repetidos es: ");
		System.out.println(fraseUsuario);
		System.out.println("Comprobando frase ........ 100%");

		// Recorrer abecedario
		for (int i = 0; i < abecedario.length; i++) {
			// Comprobar que la fraseUsuario tiene todas las letras del abecedario
			if (fraseUsuario.contains(Character.toString(abecedario[i]))) {
				contador++;
			}
		}
		if (contador == abecedario.length) {
			System.out.println("¡La frase es un pangrama!");
		} else {
			System.out.println("¡La frase no es un pangrama!");
		}
	}
}

// EJEMPLOS DE PANGRAMAS
/*
 * José compró una vieja zampoña en Perú. Excusándose, Sofía tiró su whisky al
 * desagüe de la banqueta.
 * 
 * El cadáver de Wamba, rey godo de España, fue exhumado y trasladado en una
 * caja de zinc que pesó un kilo.
 * 
 * El veloz murciélago hindú comía feliz cardillo y kiwi. La cigüeña tocaba el
 * saxofón detrás del palenque de paja.
 * 
 * El viejo Señor Gómez pedía queso, kiwi y habas, pero le ha tocado un saxofón.
 * 
 * Jovencillo emponzoñado de whisky: ¡qué figurota exhibe!
 * 
 * Quiere la boca exhausta vid, kiwi, piña y fugaz jamón.
 */
