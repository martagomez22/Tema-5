/**
 * Clase que gestiona un array de enteros
 */

public class Array<Algo> {
	
	// Atributos
	// Array con los datos
	private Algo [] array;
	
	/**
	 * Constructor con tamaño
	 * @param size Tamaño inicial del array. Debe ser cero o superior
	 * @throws IllegalArgumentException Si el tamaño es menor que cero
	 */
	
	public Array (int size) {
		if (size < 0) {
			throw new IllegalArgumentException("El tamaño del array debe ser cero o mas");
		}
		
		// Creamos el array del tamaño inicial dado
		array = new Algo [size];
	}
	/**
	 * Modifica el contenido de una casilla del array
	 * @param posicion Posición de la casilla. Válido desde 0 hasta tamaño.
	 * @throws ArrayIndexOutOfBoundsException Si la posición no es válida
	 */
	public void set (int posicion, Algo valor) {
		array [posicion] = valor;
	}
	/**
	 * Obtiene el valor almacenado en una casilla
	 * @param posicion Posición de la casilla. Válido desde 0 hasta tamaño.
	 * @throws ArrayIndexOutOfBoundsException Si la posición no es válida
	 */
	public int get (int posicion) {
		return array [posicion];
	}
	/**
	 * Obtiene el tamaño (número de casillas) del array
	 * @return Número de casillas del array
	 */
	public int size() {
		return array.length;
	}
	public void setSize (int newSize) {
		// Si el tamaño nuevo NO es correcto
		if (newSize < 0) {
			throw new IllegalArgumentException("El tamaño debe ser cero o superior");
		}
		// Si el tamaño es correcto
		// Creamos un nuevo array del tamaño especificado
		Algo[] newArray = new int [newSize];
		
		// Copiamos los elementos del antiguo al nuevo array
		// El numero de elementos sera la longitud del array mas corto
		int longitud = (array.length <= newArray.length) ? array.length : newArray.length;
		
		for (int i = 0; i < longitud; i++) {
			newArray[i] = array [i];
		}
		// Reemplazamos el array antiguo por el nuevo
		array = newArray;
	}
	/**
	 * Reinicia los contenidos del array al valor por defecto
	 */
	public void reset () {
		for (int i = 0; i < array.length; i++) {
			array [i] = 0;
		}
	}
}
