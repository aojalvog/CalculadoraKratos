package operaciones;

public class OperacionesMatematicas {

	private OperacionesMatematicas() {

	}

	/**
	 * Método para hacer la suma de dos números introducidos por el usuario
	 * 
	 * @param x primer valor
	 * @param y segundo valor
	 * @return resultado de la suma
	 */

	public static double add(double x, double y) {
		return x + y;
	}

	/**
	 * Método para hacer la resta de dos números introducidos por el usuario
	 * 
	 * @param x minuendo
	 * @param y subtraendo
	 * @return resultado de la resta
	 */

	public static double subtract(double x, double y) {
		return x - y;
	}

	/**
	 * Método para calcular la multiplicación de dos números introducidos por el
	 * usuario
	 * 
	 * @param x producto
	 * @param y producto
	 * @return resltado de la multiplicación
	 */

	public static double multiply(double x, double y) {
		return x * y;
	}

	/**
	 * Métood para calcular la división de dos números introducidos por el usuario
	 * 
	 * @param x dividendo
	 * @param y divisor
	 * @return resultado de la división
	 */

	public static double divide(double x, double y) {
		return x / y;
	}

	/**
	 * Método para calcular el resultado de elevar un número a un exponente
	 * 
	 * @param x número a elevar
	 * @param y exponente
	 * @return devuelve x^y
	 */

	public static double exponent(double x, double y) {

		return Math.pow(x, y);

	}

	/**
	 * Método para calcular la raíz cuadrada de un número
	 * 
	 * @param x número
	 * @return raíz cuadrada del número
	 */

	public static double squareRoot(double x) {
		return Math.sqrt(x);
	}

	/**
	 * Método para calcular el factorial de un número
	 * 
	 * @param number número introducido
	 * @return factorial del número
	 */

	public static long factorial(double number) {
		long result = 1;

		for (int factor = 2; factor <= number; factor++) {
			result *= factor;
		}

		return result;
	}

}
