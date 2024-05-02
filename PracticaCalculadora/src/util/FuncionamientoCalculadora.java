package util;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.Main;
import operaciones.OperacionesMatematicas;

public class FuncionamientoCalculadora {

	private FuncionamientoCalculadora() {

	}

	public static void pantalla() {

		Logger logger = Logger.getLogger(Main.class.getName());

		Scanner sc = new Scanner(System.in);
		/**
		 * Declaración de las variables que vamos a utilizar
		 */
		double x;
		double y;
		double result;
		int option;
		boolean seguir = true;

		/**
		 * Con este while vamos a imprimir por pantalla el menú y captar el número que
		 * introduce el usuario por teclado para así realizar la operación
		 * correspondiente dependiendo del número introducido.
		 */
		if (logger.isLoggable(Level.INFO)) {
			while (seguir) {

				logger.info(Menu.menu());
				option = sc.nextInt();

				switch (option) {

				/**
				 * Se introducen dos valores, y se llama al método add de la clase
				 * OperacionesMatematicas para así realizar la suma y obtener el resultado.
				 */

				case 1:
					logger.info("Introduce el valor del primer sumando");
					x = sc.nextDouble();
					logger.info("Introduce el valor del segundo sumando");
					y = sc.nextDouble();
					result = OperacionesMatematicas.add(x, y);
					logger.info(x + " + " + y + " = " + result);
					break;

				/**
				 * Se introducen dos valores, y se llama al método subtract de la clase
				 * OperacionesMatematicas para así realizar la resta y obtener el resultado.
				 */
				case 2:
					logger.info("Introduce el valor del minuendo");
					x = sc.nextDouble();
					logger.info("Introduce el valor del sustraendo");
					y = sc.nextDouble();
					result = OperacionesMatematicas.subtract(x, y);
					logger.info(x + " - " + y + " = " + result);
					break;

				/**
				 * Se introducen dos valores, y se llama al método multiply de la clase
				 * OperacionesMatematicas para así realizar la multiplicar ambos números y
				 * obtener el resultado.
				 */

				case 3:
					logger.info("Introduce el valor del primer producto");
					x = sc.nextDouble();
					logger.info("Introduce el valor del segundo producto");
					y = sc.nextDouble();
					result = OperacionesMatematicas.multiply(x, y);
					logger.info(x + " * " + y + " = " + result);
					break;

				/**
				 * Se introducen dos valores, y se llama al método divide de la clase
				 * OperacionesMatematicas para así realizar la dividir ambos números y obtener
				 * el resultado.
				 */

				case 4:
					logger.info("Introduce el valor del dividendo");
					x = sc.nextDouble();
					logger.info("Introduce el valor del divisor");
					y = sc.nextDouble();
					result = OperacionesMatematicas.divide(x, y);
					logger.info(x + " / " + y + " = " + result);
					break;

				/**
				 * Se introducen dos valores, y se llama al método exponent de la clase
				 * OperacionesMatematicas para así realizar la exponencial de ambos números y
				 * obtener el resultado.
				 */

				case 5:
					logger.info("Introduce el número");
					x = sc.nextDouble();
					logger.info("Introduce el valor del exponente");
					y = sc.nextDouble();
					result = OperacionesMatematicas.exponent(x, y);
					logger.info(x + " eleveado a " + y + " = " + result);

					break;

				/**
				 * Se introduce un valor, y se llama al método squareRoot de la clase
				 * OperacionesMatematicas para así realizar la raíz cuadrada de un número y
				 * obtener el resultado.
				 */

				case 6:

					logger.info("Introduce el número del que quieres obtener la raíz cuadrada");
					x = sc.nextDouble();
					result = OperacionesMatematicas.squareRoot(x);
					logger.info("La raíz cuadrada de " + x + " es " + result);
					break;

				/**
				 * Se introducun valor, y se llama al método factorial de la clase
				 * OperacionesMatematicas para así calcular el factorial de ese número y obtener
				 * el resultado.
				 */

				case 7:
					logger.info("Introduce el número del que quieres obtener el factorial");
					x = sc.nextDouble();
					result = OperacionesMatematicas.factorial(x);
					logger.info(x + "! = " + result);
					break;

				/**
				 * Por defecto al introducir un número que no se corresponda con los casos
				 * anteriores, sale del programa.
				 */
				default:
					seguir = false;
				}
			}

		}
		sc.close();
	}
}
