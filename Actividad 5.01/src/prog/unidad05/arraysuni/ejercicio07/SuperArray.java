package prog.unidad05.arraysuni.ejercicio07;

import java.util.Locale;
import java.util.Scanner;

public class SuperArray {

	private static final int TAMANYO_ARRAY = 30;
	
	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		// Solicitamos el número
		System.out.print("Introduce un número entero cualquiera: ");
		long numero = Integer.parseInt(sc.nextLine());
		
		// Declaramos y creamos el array
		long[] numeros = new long[TAMANYO_ARRAY];
		
		for (int i = 0; i < numeros.length; i++) {
			// Almacenamos en el array el valor que toca
			numeros[i] = numero;
			// Calculamos el siguiente valor
			numero = (numero + 1) * 2;
		}
		// Imprimimos la cabecera
		System.out.println("El array al revés es");
		// Imprimimos el array en orden inverso
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.printf(Locale.US, "%d, ", numeros[i]);
		}
		System.out.printf("%d", numeros[0]);
	}

}
