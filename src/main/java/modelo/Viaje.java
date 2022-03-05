package modelo;

import java.time.Instant;

public class Viaje {

	private Instant fechaViaje;
	private Destino destino;
	private Viajero viajero;

	public Viaje(Instant fechaViaje, Destino destino, Viajero viajero) {
		this.fechaViaje = fechaViaje;
		this.destino = destino;
		this.viajero = viajero;
	}
}
