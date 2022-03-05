package ui;

import java.time.Instant;
import java.util.Scanner;

import modelo.Destino;
import modelo.Viaje;
import modelo.Viajero;

public class DiarioViajesUI {

	private Scanner scanner;

	public DiarioViajesUI() {
		scanner = new Scanner(System.in);
	}

	public Viaje leerYCrearViaje() {
		Destino destino = crearDestino();
		Viajero viajero = crearViajero();
		Instant fechaViaje = leerFecha();
		Viaje viaje = new Viaje(fechaViaje, destino, viajero);

		System.out.println("Viaje creado");
		return viaje;
	}

	private Instant leerFecha() {
		int anio = leerInt("Ingrese el año del viaje");
		int mes = leerInt("Ingrese el mes del viaje");
		int dia = leerInt("Ingrese el dia del viaje");

		String fechaViajeString = anio + "-" + mes + "-" + dia + "T00:00:00.00Z";

		Instant fechaViaje = Instant.parse(fechaViajeString);
		return fechaViaje;
	}

	private Viajero crearViajero() {
		String nombreViajero = leerString("Ingrese nombre del viajero");
		int edadViajero = leerInt("Ingrese edad del viajero");
		Viajero viajero = new Viajero(nombreViajero, edadViajero);
		return viajero;
	}

	private Destino crearDestino() {
		String nombreDestino = leerString("Ingrese nombre del destino");
		double latitudDestino = leerDouble("Ingrese latitud del destino");
		double longitudDestino = leerDouble("Ingrese longitud del destino");

		Destino destino = new Destino(nombreDestino, latitudDestino, longitudDestino);
		return destino;
	}

	private int leerInt(String mensaje) {
		System.out.println(mensaje);
		return scanner.nextInt();
	}

	private double leerDouble(String mensaje) {
		System.out.println(mensaje);
		return scanner.nextDouble();
	}

	private String leerString(String mensaje) {
		System.out.println(mensaje);
		return scanner.next();
	}

}
