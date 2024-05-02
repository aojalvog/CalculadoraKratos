package main;

import java.util.Scanner;

import operaciones.OperacionesMatematicas;
import util.Menu;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int result;
		int option;
		boolean seguir = true;

		while (seguir) {
			System.out.println(Menu.menu());
			option = sc.nextInt();
			switch (option) {

			case 1:
				System.out.println("Introduce el valor del primer sumando");
				x = sc.nextInt();
				System.out.println("Introduce el valor del segundo sumando");
				y = sc.nextInt();
				result = OperacionesMatematicas.add(x, y);
				System.out.println(x + " + " + y + " = " + result);
				break;

			case 2:
				System.out.println("Introduce el valor del minuendo");
				x = sc.nextInt();
				System.out.println("Introduce el valor del sustraendo");
				y = sc.nextInt();
				result = OperacionesMatematicas.subtract(x, y);
				System.out.println(x + " - " + y + " = " + result);
				break;

			case 3:
				System.out.println("Introduce el valor del primer producto");
				x = sc.nextInt();
				System.out.println("Introduce el valor del segundo producto");
				y = sc.nextInt();
				result = OperacionesMatematicas.multiply(x, y);
				System.out.println(x + " * " + y + " = " + result);
				break;
			case 4:
				System.out.println("Introduce el valor del dividendo");
				x = sc.nextInt();
				System.out.println("Introduce el valor del divisor");
				y = sc.nextInt();
				result = OperacionesMatematicas.multiply(x, y);
				System.out.println(x + " / " + y + " = " + result);
				break;

			default:
				seguir = false;
			}

		}
	}

}
