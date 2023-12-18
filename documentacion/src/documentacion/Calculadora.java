package documentacion;
/**
 * Clase en la que se implementa una calculadora básica
 * 
 * 
 * @author Joaquín Carrascal Franco
 */
public class Calculadora {

	//deprecar el método sirve para avisar que no se va a seguir manteniendo
	//y que ahora se va a realizar de otra forma, posiblemente eliminandolo
	//en el futuro
	/**
	 * @deprecated 
	 * Éste método sirve para suma dos números reales
	 * @since 1.0
	 * @see "Libro gordo de Petete"
	 * @see <a href="https://google.es">Ver aquí.</a>
	 * @param a Primer operando
	 * @param b Segundo operando
	 * @return Suma de ambos números
	 */
	public double suma(double a, double b) {
		return a + b;
	}
	
	/**
	 * Éste metodo sirve para multiplicar dos números, uno
	 * entero y otro con decimal.
	 * @param a 
	 * @param b
	 * @return
	 */
	public double multiplicar(double a, int b) {
		return a * b;
	}
	
}
