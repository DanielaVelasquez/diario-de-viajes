package ui;

import java.time.Instant;
import java.util.Scanner;

import modelo.Destino;
import modelo.Viaje;
import modelo.Viajero;

public class DiarioViajesUI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Destino destino = crearDestino(scanner);
		Viajero viajero = crearViajero(scanner);
		Instant fechaViaje = leerFecha(scanner);
		Viaje viaje = new Viaje(fechaViaje, destino, viajero);

		System.out.println("Viaje creado");
	}

	private static Instant leerFecha(Scanner scanner) {
		int anio = leerInt(scanner, "Ingrese el año del viaje");
		int mes = leerInt(scanner, "Ingrese el mes del viaje");
		int dia = leerInt(scanner, "Ingrese el dia del viaje");

		String fechaViajeString = anio + "-" + mes + "-" + dia+"T00:00:00.00Z";

		Instant fechaViaje = Instant.parse(fechaViajeString);
		return fechaViaje;
	}

	private static Viajero crearViajero(Scanner scanner) {
		String nombreViajero = leerString(scanner, "Ingrese nombre del viajero");
		int edadViajero = leerInt(scanner, "Ingrese edad del viajero");
		Viajero viajero = new Viajero(nombreViajero, edadViajero);
		return viajero;
	}

	private static Destino crearDestino(Scanner scanner) {
		String nombreDestino = leerString(scanner, "Ingrese nombre del destino");
		double latitudDestino = leerDouble(scanner, "Ingrese latitud del destino");
		double longitudDestino = leerDouble(scanner, "Ingrese longitud del destino");

		Destino destino = new Destino(nombreDestino, latitudDestino, longitudDestino);
		return destino;
	}

	private static int leerInt(Scanner scanner, String s) {
		System.out.println(s);
		return scanner.nextInt();
	}

	private static double leerDouble(Scanner scanner, String mensaje) {
		System.out.println(mensaje);
		return scanner.nextDouble();
	}

	private static String leerString(Scanner scanner, String mensaje) {
		System.out.println(mensaje);
		return scanner.next();
	}

}
