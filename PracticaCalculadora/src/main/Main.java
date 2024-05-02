package main;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import operaciones.OperacionesMatematicas;
import util.Menu;

public class Main {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger(Main.class.getName());

		Scanner sc = new Scanner(System.in);
		double x;
		double y;
		double result;
		int option;
		boolean seguir = true;

		if (logger.isLoggable(Level.INFO)) {
			while (seguir) {
				logger.info(Menu.menu());
				option = sc.nextInt();

				switch (option) {

				case 1:
					logger.info("Introduce el valor del primer sumando");
					x = sc.nextDouble();
					logger.info("Introduce el valor del segundo sumando");
					y = sc.nextDouble();
					result = OperacionesMatematicas.add(x, y);
					logger.info(x + " + " + y + " = " + result);
					break;

				case 2:
					logger.info("Introduce el valor del minuendo");
					x = sc.nextDouble();
					logger.info("Introduce el valor del sustraendo");
					y = sc.nextDouble();
					result = OperacionesMatematicas.subtract(x, y);
					logger.info(x + " - " + y + " = " + result);
					break;

				case 3:
					logger.info("Introduce el valor del primer producto");
					x = sc.nextDouble();
					logger.info("Introduce el valor del segundo producto");
					y = sc.nextDouble();
					result = OperacionesMatematicas.multiply(x, y);
					logger.info(x + " * " + y + " = " + result);
					break;

				case 4:
					logger.info("Introduce el valor del dividendo");
					x = sc.nextDouble();
					logger.info("Introduce el valor del divisor");
					y = sc.nextDouble();
					result = OperacionesMatematicas.divide(x, y);
					logger.info(x + " / " + y + " = " + result);
					break;

				case 5:
					logger.info("Introduce el número");
					x = sc.nextDouble();
					logger.info("Introduce el valor del exponente");
					y = sc.nextDouble();
					result = OperacionesMatematicas.exponent(x, y);
					logger.info(x + " eleveado a " + y + " = " + result);

					break;

				case 6:
					logger.info("Introduce el número del que quieres obtener la raíz cuadrada");
					x = sc.nextDouble();
					result = OperacionesMatematicas.squareRoot(x);
					logger.info("La raíz cuadrada de " + x + " es " + result);
					break;

				case 7:
					logger.info("Introduce el número del que quieres obtener el factorial");
					x = sc.nextDouble();
					result = OperacionesMatematicas.factorial(x);
					logger.info(x + "! = " + result);
					break;

				default:
					seguir = false;
				}
			}

		}
	}

}
