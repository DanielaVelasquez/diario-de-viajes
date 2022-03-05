package ui;

import java.time.Instant;
import java.util.Scanner;

import modelo.Destino;
import modelo.Viaje;
import modelo.Viajero;

public class DiarioViajesUI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese nombre del destino");
		String nombreDestino = scanner.next();

		System.out.println("Ingrese latitud del destino");
		double latitudDestino = scanner.nextDouble();

		System.out.println("Ingrese longitud del destino");
		double longitudDestino = scanner.nextDouble();

		Destino destino = new Destino(nombreDestino, latitudDestino, longitudDestino);

		System.out.println("Ingrese nombre del viajero");
		String nombreViajero = scanner.next();

		System.out.println("Ingrese edad del viajero");
		int edadViajero = scanner.nextInt();

		Viajero viajero = new Viajero(nombreViajero, edadViajero);
		System.out.println("Ingrese el año del viaje");
		int anio = scanner.nextInt();

		System.out.println("Ingrese el mes del viaje");
		int mes = scanner.nextInt();

		System.out.println("Ingrese el dia del viaje");
		int dia = scanner.nextInt();

		String fechaViajeString = anio + "-" + mes + "-" + dia+"T00:00:00.00Z";;

		Instant fechaViaje = Instant.parse(fechaViajeString);
		Viaje viaje = new Viaje(fechaViaje, destino, viajero);
		System.out.println("Viaje creado");
	}

}
