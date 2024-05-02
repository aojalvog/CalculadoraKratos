package main;

import java.util.Scanner;

import operaciones.OperacionesMatematicas;
import util.Menu;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		int y;
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
				int sum = OperacionesMatematicas.add(x, y);
				System.out.println(x + " + " + y + " = " + sum);

			case 2:
				System.out.println("Introduce el valor del primer minuendo");
				x = sc.nextInt();
				System.out.println("Introduce el valor del segundo sustraendo");
				y = sc.nextInt();
				int sub = OperacionesMatematicas.subtract(x, y);
				System.out.println(x + " - " + y + " = " + sub);

			default:
				seguir = false;
			}
			sc.close();

		}
	}

}
