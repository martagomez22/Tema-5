import java.util.Optional;

public class PruebaGuardaAlgo {

	public static void main(String[] args) {
		
		GuardaAlgo<Integer> miAlmacenEntero = new GuardaAlgo <Integer>(); // Esta plantilla quiero usarla para guardar un entero que se mete en esta variable(miAlmacenEntero) y luego le decimos que la cree
		GuardaAlgo<Double> miAlmacenDouble = new GuardaAlgo <Double>();
		GuardaAlgo<String> miAlmacenCadena = new GuardaAlgo <String>();
		
		Optional<Integer> miValor = Optional.empty(); // Creando una caja que pueda tener un entero, en este caso, no al principio (empty)
		Optional<Double> miValor2 = Optional.of(2.5); // Creando una caja que contiene un double, en este  caso, de 2.5
				
		System.out.printf("Es -100 menor que 10): %s%n", resultado);
		
		if (miValor.isPresent()) {
			System.out.printf("El valor entero es %d%n", miValor.get()); // El get() te devuelve el valor que hay en la caja, si lanzas un get() y la caja está vacía (como es el caso), lanza excepción
			int valorActual = miValor.orElse(25); // Si contiene algo me devuelve lo que tenga, sino, pues 25. (Depende de lo que tenga por defecto)
		}
	}

}

	public static boolean estaEntre(int numero,Optional<Integer> limiteInferior, Optional<Integer> limiteSuperior) {
		if (limiteInferior.isEmpty() || numero >= limiteInferior.get()) {
			if (limiteInferior.isEmpty() || numero <= limiteSuperior.get()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		return numero >= limiteInferior.get() && numero <= limiteSuperior.get();
	}