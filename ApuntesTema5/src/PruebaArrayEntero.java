
public class PruebaArrayEntero {

	public static void main(String[] args) {
		ArrayEntero array = new ArrayEntero(20);
		array.set(0, 1);
		array.set(1, 2);
		array.setSize(1);
		if (array.size() !=1 ) {
			System.out.println("Error. No se ha cambiado el tamaño.");
		}
		else {
			if (array.get(0) != 1) {
				System.out.println("Error. Se han cambiado los datos.");
			}
		}
		System.out.println("Prueba terminada");
	}

}
