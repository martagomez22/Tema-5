import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pruebaa {

	@Test
	void testCreacionOk () {
		ArrayEntero array = new ArrayEntero(20);
	}
	@Test
	void testCreacionTamanyoMal () {
		assertThrows(IllegalArgumentException.class, () -> new ArrayEntero(-5));
	}

}
