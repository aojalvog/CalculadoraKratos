package util;

public class Menu {

	private Menu() {

	}

	/**
	 * Menú que vamos a utilizar para ver qué operaciones vamos a utilizar.
	 * 
	 * @return menu
	 */

	public static String menu() {
		return "Selecciona la operación que quieres realizar:\n " + "Pulse 1 para realizar una suma.\n "
				+ "Pulse 2 para realizar una resta.\n " + "Pulse 3 para realizar una multiplicación.\n "
				+ "Pulse 4 para realizar una división.\n" + "Pulse 5 para realizar una operación con exponentes.\n"
				+ "Pulse 6 para calcular la raíz cuadrada-\n" + "Pulse 7 para calcular el factorial.\n"
				+ "Pulse cualquier otro número para salir.";
	}

}
