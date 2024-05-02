package operaciones;

public class OperacionesMatematicas {

	private OperacionesMatematicas() {

	}
	// método suma

	public static double add(double x, double y) {
		return x + y;
	}

	// método resta

	public static double subtract(double x, double y) {
		return x - y;
	}

	// método multiplicación

	public static double multiply(double x, double y) {
		return x * y;
	}

	// método división

	public static double divide(double x, double y) {
		return x / y;
	}

	// método exponente

	public static double exponent(double x, double y) {

		return Math.pow(x, y);

	}

	// método raíz square root

	public static double squareRoot(double x) {
		return Math.sqrt(x);
	}

	// método calcular factorial

	public static long factorial(double number) {
		long result = 1;

		for (int factor = 2; factor <= number; factor++) {
			result *= factor;
		}

		return result;
	}

}
