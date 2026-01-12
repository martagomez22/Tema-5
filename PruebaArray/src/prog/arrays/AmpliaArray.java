package prog.arrays;

import java.util.Scanner;

public class AmpliaArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		int[] numeros = new int[0];
		do {
			// Solicitamos el numero
			System.out.print("Introduzca un numero (negativo para terminar): ");
			numero = Integer.parseInt(sc.nextLine());
			// Si el numero no es negativo
			if (numero >= 0) {
				// Creamos un array temporal con un tamaño ampliado en 1
				int[] temporal = new int[numeros.length + 1];
				// Copiamos el contenido del array original al nuevo
				for (int i = 0; i < numeros.length; i++) {
					temporal[i] = numeros [i];
				}
				// Insertamos el nuevo valor al final del array
				temporal[temporal.length - 1] = numero;
				numeros = temporal;
			}
		} while (numero >= 0);

		// Imprimimos todo el array
		System.out.println("El contenido del array es: ");
		for (int valor: numeros) {
			System.out.printf("%d, ", valor);
		}
	}

}
